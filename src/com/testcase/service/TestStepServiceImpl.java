package com.testcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testcase.dao.TestStepDao;
import com.testcase.model.TestStep;

@Service("testStepService")
@Transactional
public class TestStepServiceImpl implements TestStepService {

	@Autowired
	TestStepDao testStepDao;
	
	@Override
	public void save(TestStep testStep) {
		// TODO Auto-generated method stub
		testStepDao.save(testStep);
		
	}

}
