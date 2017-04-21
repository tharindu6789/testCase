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
public class TestStep implements java.io.Serializable{

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEST_STEP_ID")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name="TEST_CASE_ID",referencedColumnName="TEST_CASE_ID",nullable=false,unique=true)
	private TestCase testcase;
	
	@Column(name = "TEST_STEP")
	private String test_step;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TestCase getTestcase() {
		return testcase;
	}

	public void setTestcase(TestCase testcase) {
		this.testcase = testcase;
	}

	public String getTest_step() {
		return test_step;
	}

	public void setTest_step(String test_step) {
		this.test_step = test_step;
	}

}
