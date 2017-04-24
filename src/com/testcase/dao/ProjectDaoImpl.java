package com.testcase.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.testcase.model.Project;
import com.testcase.model.TestCase;
import com.testcase.model.User;

@Repository("projectDao")
public class ProjectDaoImpl extends AbstractDao<Integer, Project> implements ProjectDao{

	@Override
	public Project findById(int id) {
		return getByKey(id);
	}

	@Override
	public void save(Project project) {
		persist(project);	
	}

	@Override
	public List<Project> getAllData() {
		Criteria criteria = createEntityCriteria();
		return (List<Project>) criteria.list();	
	}
	@Override
	public int getLastId() {
        int id=0;
		Criteria c= createEntityCriteria();
		 c.addOrder(Order.desc("id"));
         c.setMaxResults(1);
         if (c.uniqueResult() != null){
        	 id= (int) ((Project) c.uniqueResult()).getId();
         }
		return id;
	}
}
