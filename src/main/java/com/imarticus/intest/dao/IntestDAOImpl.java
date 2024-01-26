package com.imarticus.intest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

import com.imarticus.intest.model.Tests;
public class IntestDAOImpl implements IntestDAO {
	@Override
	public Set<Tests> getTestSchedules() {
		final String METHOD_NAME = "getTestSchedules";
		System.out.println("Method Invoked:" + METHOD_NAME + ":");
		Set<Tests> testSet = null;
		final String TESTS_QUERY = "select * from tests";
		try (Connection connection = DBUtil.getConnection(); 
				PreparedStatement pstStatement = connection.prepareStatement(TESTS_QUERY)) {
			ResultSet resultSet = pstStatement.executeQuery();
			testSet=new TreeSet<>();
			while (resultSet.next()) {
					Tests test=new Tests();
					test.setTestCode(resultSet.getInt(1));
					test.setTestName(resultSet.getString(2));
					test.setTestDate(resultSet.getDate(3));
					test.setTestDuration(resultSet.getInt(4));
					test.setTestMarks(resultSet.getInt(5));
					test.setQuestionCount(resultSet.getInt(6));
					testSet.add(test);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Response From The Method:" + METHOD_NAME + ":" + testSet);
		return testSet;
	}
}
