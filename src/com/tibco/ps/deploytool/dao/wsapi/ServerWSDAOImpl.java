/**
 * (c) 2017 TIBCO Software Inc. All rights reserved.
 * 
 * Except as specified below, this software is licensed pursuant to the Eclipse Public License v. 1.0.
 * The details can be found in the file LICENSE.
 * 
 * The following proprietary files are included as a convenience, and may not be used except pursuant
 * to valid license to Composite Information Server or TIBCO(R) Data Virtualization Server:
 * csadmin-XXXX.jar, csarchive-XXXX.jar, csbase-XXXX.jar, csclient-XXXX.jar, cscommon-XXXX.jar,
 * csext-XXXX.jar, csjdbc-XXXX.jar, csserverutil-XXXX.jar, csserver-XXXX.jar, cswebapi-XXXX.jar,
 * and customproc-XXXX.jar (where -XXXX is an optional version number).  Any included third party files
 * are licensed under the terms contained in their own accompanying LICENSE files, generally named .LICENSE.txt.
 * 
 * This software is licensed AS-IS. Support for this software is not covered by standard maintenance agreements with TIBCO.
 * If you would like to obtain assistance with this software, such assistance may be obtained through a separate paid consulting
 * agreement with TIBCO.
 * 
 */
package com.tibco.ps.deploytool.dao.wsapi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
 



import com.tibco.ps.common.exception.ApplicationException;
import com.tibco.ps.common.exception.CompositeException;
import com.tibco.ps.common.exception.ValidationException;
import com.tibco.ps.common.util.CommonUtils;
import com.tibco.ps.common.util.CompositeLogger;
import com.tibco.ps.common.util.wsapi.CisApiFactory;
import com.tibco.ps.common.util.wsapi.CompositeServer;
import com.tibco.ps.common.util.wsapi.WsApiHelperObjects;
import com.tibco.ps.deploytool.dao.ServerDAO;
import com.tibco.ps.deploytool.util.DeployUtil;
import com.compositesw.services.system.admin.ServerPortType;
import com.compositesw.services.system.admin.server.LicenseList;
import com.cs.admin.monitor.MonitorConnectionFactory;

public class ServerWSDAOImpl implements ServerDAO {

	private static Log logger = LogFactory.getLog(ServerWSDAOImpl.class);
	
	private static String STATUS_OPERATIONAL = "OPERATIONAL";
	private static String STATUS_STOPPED = "STOPPED";	
	
	/* (non-Javadoc)
	 * @see com.tibco.ps.deploytool.dao.ServerAttributeDAO#takeServerAttributeAction(com.tibco.ps.common.util.wsapi.CompositeServer)
	 */
//	@Override
	public void pingServer(CompositeServer targetServer) throws CompositeException {	
		// Use the simple getLicesense invocation that takes no parameters.  This either works or it does not.
		// This method is used to test whether the "targetServer" information is correct or not.
		// Any exception with this method call indicates the "targetServer" information is incorrect.
		if(logger.isDebugEnabled()) {		
			logger.debug("ServerWSDAOImpl.pingServer(targetServer).  id="+targetServer.getId()+"  host="+targetServer.getHostname()+"  port="+targetServer.getPort()+"  domain="+targetServer.getDomain()+"  user="+targetServer.getUser());
		}
		try {
			ServerPortType port = CisApiFactory.getServerPort(targetServer);
			if(logger.isDebugEnabled()) {
				logger.debug("ServerWSDAOImpl.pingServer().  Invoking port.getLicenses().");
			}
			
			LicenseList licenses = port.getLicenses();
			
			if(logger.isDebugEnabled()) {
				logger.debug("ServerWSDAOImpl.pingServer().  Success: port.getLicenses().");
			}
		} catch(Exception e) {
			CompositeLogger.logException(e, DeployUtil.constructMessage(DeployUtil.MessageType.ERROR.name(), "pingServer::The Server identified by id=["+targetServer.getId()+"] is unavailable.", "ServerManager", "serverId", targetServer));
			throw new ValidationException(e.getMessage(), e);
		}
	}
	
//	@Override
	public void takeServerManagerAction(String actionName, String serverId, String pathToServersXML) throws CompositeException {	
		
		if(logger.isDebugEnabled()) {		
			logger.debug("ServerWSDAOImpl.takeServerManagerAction(actionName, serverId, pathToServersXML).  actionName="+actionName+"  serverId="+serverId+"  pathToServersXML="+pathToServersXML);
		}
		// -- read target server properties from xml and build target server object based on target server name 
		CompositeServer targetServer = WsApiHelperObjects.getServerLogger(serverId, pathToServersXML, "ServerWSDAOImpl.takeServerManagerAction("+actionName+")", logger);
		
		String hostname = targetServer.getHostname();
		int port = targetServer.getPort() + 6;
		String username = targetServer.getUser();
		String password = targetServer.getPassword();
		String domain = targetServer.getDomain();
		String command = null;
		
		String userAtDomain = username + "@" + domain;
		
		// -- from the api
		int timeout = 300000;
		
		try {
			
			// -- common logic regardless of action
			String[] servers = MonitorConnectionFactory.createConnection(hostname, port, 
					userAtDomain, password, timeout).getServerList();
			
			if (servers.length > 1)
				throw new CompositeException("Server Module does not support multiple instances of Composite per monitor process");
			
			String server = servers[0];
			
			if(logger.isDebugEnabled()) {
				logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Invoking MonitorConnectionFactory.createConnection(\""+hostname+"\", \""+port+"\", \""+userAtDomain+"\", ********, \""+timeout+"\").getServerStatus(new String[] {server}).");
			}
			
			// -- You can get back multiple status values from a single server
			//    You want to use MonitorConnectionFactory because the return class
			//    has only package visibility
			String[] statuses = MonitorConnectionFactory.createConnection(hostname, port, userAtDomain, password, timeout).getServerStatus(new String[] {server});
			
			if(logger.isDebugEnabled()) {
				logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Success: MonitorConnectionFactory.createConnection().getServerStatus().");
			}
			
			// -- I've not seen a situation where multiple status messages from the
			//    same server were different
			String status = statuses[statuses.length - 1].toUpperCase();
			
			/*******************************
			 *  START the Server
			 *******************************/
			if (actionName.equalsIgnoreCase(ServerDAO.action.START.name())) 
			{	
				command = "startServer";

				if (STATUS_OPERATIONAL.equals(status)) {
					logger.info("Server " + server + " is operational - there is no need to start it.");
					return;
				}
				
				logger.info("Status of server " + server + " is: " + status + ". Starting server.");
				
				if(logger.isDebugEnabled()) {
					logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Invoking MonitorConnectionFactory.createConnection(\""+hostname+"\", \""+port+"\", \""+userAtDomain+"\", ********, \""+timeout+"\").startServer(server).");
				}

				// Don't execute if -noop (NO_OPERATION) has been set otherwise execute under normal operation.
				if (CommonUtils.isExecOperation()) 
				{					
					// -- this is a blocking call
					MonitorConnectionFactory.createConnection(hostname, port, userAtDomain, password, timeout).startServer(server);
					
					statuses = MonitorConnectionFactory.createConnection(hostname, port, userAtDomain, password, timeout).getServerStatus(new String[] {server});
	
					if(logger.isDebugEnabled()) {
						logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Success: MonitorConnectionFactory.createConnection().getServerStatus().");
					}
					
					status = statuses[statuses.length - 1].toUpperCase();	
					
					logger.info("Status of server " + server + " is now: " + status + ".");
					
					if (!STATUS_OPERATIONAL.equals(status))
						throw new CompositeException("Server " + server + " was not started successfully. Status is: " + status + ".");
				} else {
					logger.info("\n\nWARNING - NO_OPERATION: COMMAND ["+command+"], ACTION ["+actionName+"] WAS NOT PERFORMED.\n");						
				}
				
				return;

				/*******************************
				 *  STOP the Server
				 *******************************/
			} 
			else if (actionName.equalsIgnoreCase(ServerDAO.action.STOP.name())) 
			{
				command = "stopServer";

				pingServer(targetServer);

				if (STATUS_STOPPED.equals(status)) {
					logger.info("Server " + server + " is stopped - there is no need to stop it.");
					return;
				}
				
				logger.info("Status of server " + server + " is: " + status + ". Stopping server.");
				
				if(logger.isDebugEnabled()) {
					logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Invoking MonitorConnectionFactory.createConnection(\""+hostname+"\", \""+port+"\", \""+userAtDomain+"\", ********, \""+timeout+"\").stopServer(server).");
				}

				// Don't execute if -noop (NO_OPERATION) has been set otherwise execute under normal operation.
				if (CommonUtils.isExecOperation()) 
				{					
					MonitorConnectionFactory.createConnection(hostname, port, userAtDomain, password, timeout).stopServer(server);
					
					statuses = MonitorConnectionFactory.createConnection(hostname, port, userAtDomain, password, timeout).getServerStatus(new String[] {server});
					
					if(logger.isDebugEnabled()) {
						logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Success: MonitorConnectionFactory.createConnection().getServerStatus().");
					}
	
					status = statuses[statuses.length - 1].toUpperCase();	
					
					logger.info("Status of server " + server + " is now: " + status + ".");
					
					if (!STATUS_STOPPED.equals(status))
						throw new CompositeException("Server " + server + " was not stopped successfully.");
				} else {
					logger.info("\n\nWARNING - NO_OPERATION: COMMAND ["+command+"], ACTION ["+actionName+"] WAS NOT PERFORMED.\n");						
				}
				
				return;

				/*******************************
				 *  RESTART the Server
				 *******************************/
			} 
			else if (actionName.equalsIgnoreCase(ServerDAO.action.RESTART.name())) 
			{
				command = "restartServer";
				
				pingServer(targetServer);

				// -- v2 - just go ahead and start it
				if (STATUS_STOPPED.equals(status)) {
					logger.info("Server " + server + " is stopped - it can not be restarted.");
					return;
				}
				
				logger.info("Status of server " + server + " is: " + status + ". Restarting server.");
				
				if(logger.isDebugEnabled()) {
					logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Invoking MonitorConnectionFactory.createConnection(\""+hostname+"\", \""+port+"\", \""+userAtDomain+"\", ********, \""+timeout+"\").restartServer(server).");
				}

				// Don't execute if -noop (NO_OPERATION) has been set otherwise execute under normal operation.
				if (CommonUtils.isExecOperation()) 
				{					
					MonitorConnectionFactory.createConnection(hostname, port, userAtDomain, password, timeout).restartServer(server);
					
					statuses = MonitorConnectionFactory.createConnection(hostname, port, userAtDomain, password, timeout).getServerStatus(new String[] {server});
	
					if(logger.isDebugEnabled()) {
						logger.debug("ServerWSDAOImpl.takeServerManagerAction(\""+actionName+"\").  Success: MonitorConnectionFactory.createConnection().getServerStatus().");
					}
	
					status = statuses[statuses.length - 1].toUpperCase();	
					
					logger.info("Status of server " + server + " is now: " + status + ".");
					
					if (!STATUS_OPERATIONAL.equals(status))
						throw new CompositeException("Server " + server + " was not restarted successfully. Status is: " + status + ".");
				} else {
					logger.info("\n\nWARNING - NO_OPERATION: COMMAND ["+command+"], ACTION ["+actionName+"] WAS NOT PERFORMED.\n");						
				}
				
				return;

			}
			
			if(logger.isDebugEnabled())	{
				logger.debug("ServerWSDAOImpl.takeServerAttributeAction::actionName=" + actionName + " was successful.");
			}

		} catch (Exception e) {
			CompositeLogger.logException(e, DeployUtil.constructMessage(DeployUtil.MessageType.ERROR.name(), actionName, "Server", "serverId", targetServer));
			throw new ApplicationException(e.getMessage(), e);
		}
			
	}

}
