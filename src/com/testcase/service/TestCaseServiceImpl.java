package com.testcase.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testcase.dao.TestCaseDao;
import com.testcase.dao.TestStepDao;
import com.testcase.model.TestCase;
import com.testcase.model.TestStep;

@Service("testCaseService")
@Transactional
public class TestCaseServiceImpl implements TestCaseService{
	@Autowired
	private TestCaseDao dao;
	@Autowired
	private TestStepDao stepdao;
	
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
	TestCase entity= dao.findById(testCase.getId());
	if(entity !=null){/*
	entity.setFunc_require(testCase.getFunc_require());
	entity.setNon_func_require(testCase.getNon_func_require());
	entity.setTest_suit_id(testCase.getTest_suit_id());*/
}
		
	}

	@Override
	public List<TestCase> getAllData() {
		// TODO Auto-generated method stub
		return dao.getAllData();
	}

	@Override
	public void saveCaseSteps(TestCase testCase, Set<TestStep> testSteps) {
		testCase.setId(dao.getLastId()+1);
dao.save(testCase);
for(TestStep step: testSteps){
	step.setTest_case_id(testCase.getId());
	stepdao.save(step);
}
	}




}
