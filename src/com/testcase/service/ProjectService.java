package com.testcase.service;

import java.util.ArrayList;
import java.util.List;

import com.testcase.model.Project;

public interface ProjectService {
	Project findById(int id);

	void save(Project project);

	void update(Project project);

	ArrayList<String> GenerateTestCase(String paragraph);

	List<Project> getAllData();

	public ArrayList<String> getPrequisite(String paragraph);

	public ArrayList<String> getDescription(String paragraph);

	public ArrayList<ArrayList<String>> getSentByRule(String rule,String paragraph);
	
	public String getTestSuiteDesc(String paragraph);
	
	public String getTestCaseName(String paragraph);
}
