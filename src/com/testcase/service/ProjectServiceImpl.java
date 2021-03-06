package com.testcase.service;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testcase.dao.ProjectDao;
import com.testcase.model.Project;

@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDao dao;

	@Override
	public Project findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void save(Project project) {
		project.setId(dao.getLastId() + 1);
		dao.save(project);
	}

	@Override
	public void update(Project project) {
		Project entity = dao.findById(project.getId());
		if (entity != null) {
			entity.setProjectName(project.getProjectName());
			entity.setFunc_require(project.getFunc_require());
			entity.setNon_func_require(project.getNon_func_require());
			entity.setStatus(project.getStatus());
		}
	}

	@Override
	public List<Project> getAllData() {
		return dao.getAllData();
	}

	@Override
	public ArrayList<String> GenerateTestCase(String paragraph) {
		ArrayList<String> testCaseList = new ArrayList<String>();

		try {
			testCaseList = new testNlp().GenerateTestCase(paragraph);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return testCaseList;
	}
	@Override
	public ArrayList<String> GenerateTestCaseNon(String paragraph) {
		ArrayList<String> testCaseList = new ArrayList<String>();
		
		try {
			testCaseList = new testNlp().GenerateTestCaseNon(paragraph);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return testCaseList;
	}

	public ArrayList<String> getPrequisite(String paragraph) {
		ArrayList<String> prelist = new ArrayList<String>();

		try {
			prelist = new PrerequisiteRules().prerequisteValidate(paragraph);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prelist;
	}

	public ArrayList<String> getDescription(String paragraph) {
		ArrayList<String> prelist = new ArrayList<String>();

		try {
			prelist = new TestDescRules().descValidate(paragraph);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return prelist;
	}

	public ArrayList<ArrayList<String>> getSentByRule(String rule, String paragraphs) {
		String[] scenes = paragraphs.split("\\r?\\n");

		ArrayList<ArrayList<String>> preListAll = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < scenes.length; i++) {
			ArrayList<String> preList = new ArrayList<String>();
			System.out.println("scen" + i + ":" + scenes);
			preList = new Rules().validate(rule, scenes[i]);// pass the spilt
															// paragraph

			System.out.println("TESTCASE" + i + preList);

			Set<String> hs = new LinkedHashSet<>(preList);
			// hs.addAll(testList);
			preList.clear();
			preList.addAll(hs);
			preListAll.add(preList);
		}
		return preListAll;
	}

	public String getTestSuiteDesc(String sentence) {

		sentence = new TestSuiteDescRule().validateSentence(sentence);
		return sentence;
	}

	public String getTestCaseName(String sentence) {

		sentence = new TestCaseNameRule().validateSentence(sentence);
		return sentence;
	}
	
	public String getTCByRule2(String rule,String paragraph) {
		
		return new Rules2().validate(rule, paragraph);
	}

	

}
