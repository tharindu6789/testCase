package com.testcase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_SUITE")
public class TestSuite {

	@Id
	@Column(name = "TEST_SUITE_ID")
	private int id;
	
	@Column(name = "PROJECT_ID")
	private int project_id;
	
	@Column(name = "TEST_SUIT_NAME")
	private String test_suit_name;
	
	@Column(name = "STATUS")
	private int status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getProject() {
		return project_id;
	}

	public void setProject(int project) {
		this.project_id = project;
	}

	public String getTest_suit_name() {
		return test_suit_name;
	}

	public void setTest_suit_name(String test_suit_name) {
		this.test_suit_name = test_suit_name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
