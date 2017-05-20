package com.njs.demo.client;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

public class ClientTest {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 * @throws URISyntaxException
	 */
	public static void main(String[] args) throws Exception {

		Client client = Client.create();
		
		URI u =new URI("http://localhost:8080/MavenJerseySpringDemo/rest/demo/getUserJsonPost");  
	    System.out.println(u);  
	    WebResource resource = client.resource(u);  
	    MultivaluedMapImpl params = new MultivaluedMapImpl();  
	    params.add("name", "wang4");  
	    String result = resource.type(MediaType.APPLICATION_FORM_URLENCODED).post(String.class,params);  
	    System.out.println(result);

	}

}