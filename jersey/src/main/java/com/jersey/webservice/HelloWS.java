package com.jersey.webservice;

import javax.annotation.security.PermitAll;
//import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.core.Context;

@PermitAll
@Path("/hello")
public class HelloWS {
//	@Context
//	HttpServletRequest request;

	@GET
	public String sayHelloWorld() {
		return "Hello world";
	}

	@POST
	public String postHello() {
		return "hello world, you post it";
	}
}