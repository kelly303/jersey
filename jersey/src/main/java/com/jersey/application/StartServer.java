package com.jersey.application;

import javax.ws.rs.ApplicationPath;
import org.apache.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class StartServer extends ResourceConfig {
	private static Logger LOG = Logger.getLogger(StartServer.class);

	public StartServer() {
		LOG.info("server initialize");
		register(com.jersey.webservice.HelloWS.class);
		LOG.info("server is started");
	}
}
