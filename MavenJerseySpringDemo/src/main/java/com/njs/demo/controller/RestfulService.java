package com.njs.demo.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.njs.demo.bean.User;
import com.njs.demo.service.DemoService;

@Component
@Path("/demo")
public class RestfulService {

	@Autowired
	DemoService demoService;

	@GET
	@Path("/hello")
	public String sayHello() {
		return demoService.say();

	}

	@GET
	@Path("/getUserXml")
	@Produces(MediaType.APPLICATION_XML)
	public User getUserXml() {
		User user = demoService.getUserXml();
		return user;
	}

	@GET    
    @Path("/getUserJson")    
    @Produces(MediaType.APPLICATION_JSON)    
    public User getUserJson() {    
		User user = demoService.getUserXml();
		return user;
    }
	
	@POST    
    @Path("/getUserJsonPost")    
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)  
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_JSON})  
    public User getUserJsonPost() {    
		User user = demoService.getUserXml();
		return user;
    }
	
}