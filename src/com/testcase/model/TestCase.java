package com.testcase.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_CASE")
public class TestCase implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEST_CASE_ID")
	private int id;
	/*
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEST_SUITE_ID")
	private TestSuite test_suit_id;*/
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "PREREQUISITE")
	private String prerequisite;
	
	@Column(name = "OUTCOME")
	private String outcome;
	
	@Column(name = "ALTERNATIVE")
	private String alternative;
	
	
	private Set<TestStep> test_step = new HashSet<TestStep>(0);
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TEST_CASE")
	public Set<TestStep> getTestSteps() {
		return this.test_step;
	}
	
	public void setTestSteps(Set<TestStep> test_steps) {
		this.test_step = test_step;
	}
}
