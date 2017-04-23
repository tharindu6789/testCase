package com.testcase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_STEP")
public class TestStep {
	
	public TestStep(){}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEST_STEP_ID")
	private int id;
	
	@Column(name = "TEST_CASE_ID")
	private int test_case_id;
	

	@Column(name = "TEST_STEP")
	private String test_step;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getTest_case_id() {
		return test_case_id;
	}

	public void setTest_case_id(int test_case_id) {
		this.test_case_id = test_case_id;
	}
	public String getTest_step() {
		return test_step;
	}

	public void setTest_step(String test_step) {
		this.test_step = test_step;
	}

}
