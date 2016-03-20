package com.tea.plantation.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.tea.plantation.PermEmpSalary;
import com.tea.plantation.Track;

@Path("/teaPlantation/")
public class TeaPlantationRestService {

	@GET
	@Path("/getEmployeeDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public PermEmpSalary getTrackInJSON() {

		PermEmpSalary PermEmpSalary = new PermEmpSalary();
		PermEmpSalary.setCategoryID(3L);
		PermEmpSalary.setWorkingHrs(8.0);

		return PermEmpSalary;

	}

	@POST
	@Path("/addEmployeeDetails/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(PermEmpSalary permEmpSalary) {

		String result = "Track saved : " + permEmpSalary;
		System.out.println("result categoryID: " + permEmpSalary.getCategoryID());
		return Response.status(201).entity(result).build();
		
	}

	@POST
	@Path("/test/")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response test(Track track) {

		String result = "Track saved : " + track;
		System.out.println("result categoryID: " + track.getSinger());
		return Response.status(201).entity(result).build();
/*
  {
 "categoryID":"2",
 "noOfEmp":"3",
 "workingHrs":"8.0",
 "unitAmount":"6"
 }
 */

	}
	
}