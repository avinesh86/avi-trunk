package com.avi.teap;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;

@Path("/teapmain/")
public class TeapMain {
    long currentId = 123;
//    Map<Long, Customer> customers = new HashMap<Long, Customer>();
//    Map<Long, Order> orders = new HashMap<Long, Order>();

    public TeapMain() {
    	
    }
    
    @POST
    @Path("/sync/addPermEmpSalary/")
    @Consumes("text/plain")
    @Produces("text/plain")
    public Response syncData() {
        
    	String result = "Track saved : ";
		return Response.status(201).entity(result).build();
    }


}