package com.imarticus.intest.service;

import java.util.Set;

import com.imarticus.intest.model.Tests;

public interface IntestService {
	public abstract Set<Tests> getTestSchedules();
}
