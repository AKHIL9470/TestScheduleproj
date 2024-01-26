package com.imarticus.intest.service;

import java.util.Set;

import com.imarticus.intest.dao.IntestDAO;
import com.imarticus.intest.dao.IntestDAOImpl;
import com.imarticus.intest.model.Tests;

public class IntestServiceImpl implements IntestService {
	private IntestDAO intestDAO;

	public IntestServiceImpl() {
		intestDAO = new IntestDAOImpl();
	}

	@Override
	public Set<Tests> getTestSchedules() {
		final String METHOD_NAME = "getTestSchedules";
		System.out.println("Method Invoked:" + METHOD_NAME + ":");
		Set<Tests> testSet = intestDAO.getTestSchedules();
		if(testSet.isEmpty()) {
			// throw User Defined Exception
			// No Tests Scheduled for the resource
			System.out.println("No Test Schedules So Far");
		}
		System.out.println("Response From The Method:" + METHOD_NAME + ":" + testSet);
		return testSet;
	}
	
}
