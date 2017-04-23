package com.testcase.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.testcase.model.TestCase;

@Repository("testCaseDao")
public class TestCaseDaoImpl extends AbstractDao<Integer, TestCase> implements TestCaseDao {

	@Override
	public TestCase findById(int id) {
		return getByKey(id);
	}

	@Override
	public void save(TestCase testSuite) {
		persist(testSuite);
	}

	@Override
	public List<TestCase> getAllData() {
		Criteria criteria = createEntityCriteria();
		return (List<TestCase>) criteria.list();
	}

	@Override
	public int getLastId() {
        int id=0;
		Criteria c= createEntityCriteria();
		 c.addOrder(Order.desc("id"));
         c.setMaxResults(1);
         if (c.uniqueResult() != null){
        	 id= (int) ((TestCase) c.uniqueResult()).getId();
         }
		return id;
	}

	

}
