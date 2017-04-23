package com.testcase.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_CASE")
public class TestCase {

	@Id
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
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrerequisite() {
		return prerequisite;
	}

	public void setPrerequisite(String prerequisite) {
		this.prerequisite = prerequisite;
	}

	public String getOutcome() {
		return outcome;
	}

	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}

	public String getAlternative() {
		return alternative;
	}

	public void setAlternative(String alternative) {
		this.alternative = alternative;
	}


	
}
