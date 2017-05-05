package com.testcase.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.testcase.model.TestStep;

@Repository("testStepDao")
public class TestStepDaoImpl extends AbstractDao<Integer, TestStep> implements TestStepDao {

	@Override
	public void save(TestStep testStep) {
		
		persist(testStep);
	}
	
	public int getLastId() {
        int id=0;
		Criteria c= createEntityCriteria();
		 c.addOrder(Order.desc("id"));
         c.setMaxResults(1);
         if (c.uniqueResult() != null){
        	 id= (int) ((TestStep) c.uniqueResult()).getId();
         }
		return id;
	}

}
