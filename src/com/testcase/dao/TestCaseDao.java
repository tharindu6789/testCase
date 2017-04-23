package com.testcase.dao;

import java.util.List;

import com.testcase.model.TestCase;
import com.testcase.model.TestStep;

public interface TestCaseDao {

	TestCase findById(int id);

	void save(TestCase testSuite);

	int getLastId();
	List<TestCase> getAllData();
}
