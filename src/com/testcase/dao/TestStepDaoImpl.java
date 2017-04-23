package com.testcase.dao;

import org.springframework.stereotype.Repository;

import com.testcase.model.TestStep;

@Repository("testStepDao")
public class TestStepDaoImpl extends AbstractDao<Integer, TestStep> implements TestStepDao {

	@Override
	public void save(TestStep testStep) {
		
		persist(testStep);
	}

}
