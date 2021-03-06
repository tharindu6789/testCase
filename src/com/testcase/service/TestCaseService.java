package com.testcase.service;

import java.util.List;
import java.util.Set;

import com.testcase.model.Project;
import com.testcase.model.TestCase;
import com.testcase.model.TestStep;
import com.testcase.model.TestSuite;

public interface TestCaseService {
	TestCase findById(int id);

	void save(TestCase testCase);

	void saveCaseSteps(TestCase testCase,Set<TestStep> testSteps);
	
	 void saveSuiteCases(TestSuite testSuite, Set<TestCase> testCases,Set<TestStep> testSteps);
	
	void saveProjectSuites(Project project, Set<TestSuite> testSuites,Set<TestCase> testCases, Set<TestStep> testSteps);

	void update(TestCase testCase);

	List<TestCase> getAllData();
}
