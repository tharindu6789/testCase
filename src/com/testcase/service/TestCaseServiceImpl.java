package com.testcase.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testcase.dao.ProjectDao;
import com.testcase.dao.TestCaseDao;
import com.testcase.dao.TestStepDao;
import com.testcase.dao.TestSuiteDao;
import com.testcase.model.Project;
import com.testcase.model.TestCase;
import com.testcase.model.TestStep;
import com.testcase.model.TestSuite;

@Service("testCaseService")
@Transactional
public class TestCaseServiceImpl implements TestCaseService {
	@Autowired
	private TestCaseDao dao;
	@Autowired
	private TestStepDao stepdao;

	@Autowired
	private TestSuiteDao suitdao;

	@Autowired
	private ProjectDao projectdao;

	@Override
	public TestCase findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void save(TestCase testCase) {
		dao.save(testCase);
	}

	@Override
	public void update(TestCase testCase) {
		TestCase entity = dao.findById(testCase.getId());
		if (entity != null) {/*
								 * entity.setFunc_require(testCase.
								 * getFunc_require());
								 * entity.setNon_func_require(testCase.
								 * getNon_func_require());
								 * entity.setTest_suit_id(testCase.
								 * getTest_suit_id());
								 */
		}

	}

	@Override
	public List<TestCase> getAllData() {
		// TODO Auto-generated method stub
		return dao.getAllData();
	}

	@Override
	public void saveCaseSteps(TestCase testCase, Set<TestStep> testSteps) {
		dao.save(testCase);
		for (TestStep step : testSteps) {
			step.setTest_case_id(testCase.getId());
			stepdao.save(step);
		}
	}
	public void saveSuiteCases(TestSuite testSuite, Set<TestCase> testCases,Set<TestStep> testSteps) {
		suitdao.save(testSuite);
		for (TestCase tcase : testCases) {
			tcase.setTest_suit_id(testSuite.getId());
			tcase.setId(dao.getLastId()+1);
			saveCaseSteps(tcase, testSteps);
		}
	}
	public void saveProjectSuites(Project project, Set<TestSuite> testSuites,Set<TestCase> testCases, Set<TestStep> testSteps) {
		project.setId(projectdao.getLastId() + 1);
		projectdao.save(project);
		for (TestSuite tsuite : testSuites) {
			tsuite.setProject(project.getId());
			tsuite.setId(suitdao.getLastId()+1);
			saveSuiteCases(tsuite, testCases,testSteps);
		}
	}

}
