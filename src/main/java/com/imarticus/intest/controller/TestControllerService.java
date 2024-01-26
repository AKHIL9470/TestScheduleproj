package com.imarticus.intest.controller;

import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.imarticus.intest.model.Tests;
import com.imarticus.intest.service.IntestService;
import com.imarticus.intest.service.IntestServiceImpl;
@Path("exam")
public class TestControllerService {
	private IntestService intestService;

	public TestControllerService() {
		intestService = new IntestServiceImpl();

	}
	@GET
	@Path("{candidateId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Set<Tests> getTestSchedules(@PathParam("candidateId") int candidateId) {
		System.out.println(candidateId);
		Set<Tests> testSchedules = intestService.getTestSchedules();
		return testSchedules;
	}
}
