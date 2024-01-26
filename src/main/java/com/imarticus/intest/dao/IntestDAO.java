package com.imarticus.intest.dao;

import java.util.Set;

import com.imarticus.intest.model.Tests;

public interface IntestDAO {
	public abstract Set<Tests> getTestSchedules();
}
