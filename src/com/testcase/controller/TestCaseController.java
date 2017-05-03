package com.testcase.controller;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testcase.model.Project;
import com.testcase.model.TestCase;
import com.testcase.model.TestStep;
import com.testcase.model.TestSuite;
import com.testcase.service.TestCaseService;
import com.testcase.service.TestStepService;

@RestController
public class TestCaseController {

	@Autowired
	TestCaseService testCaseService; // Service which will do all data
										// retrieval/manipulation work

	@Autowired
	TestStepService testStepService;

	// -------------------Retrieve All
	// Users--------------------------------------------------------
	@RequestMapping(value = "/testCase/", method = RequestMethod.GET)
	public ResponseEntity<List<TestCase>> listAllUsers() {
		List<TestCase> testCases = testCaseService.getAllData();
		if (testCases.isEmpty()) {
			return new ResponseEntity<List<TestCase>>(HttpStatus.NO_CONTENT);// You
																				// many
																				// decide
																				// to
																				// return
																				// HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<TestCase>>(testCases, HttpStatus.OK);
	}

	// -------------------Retrieve Single
	// User--------------------------------------------------------
	@RequestMapping(value = "/testCase/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TestCase> getUser(@PathVariable("id") int id) {
		System.out.println("Fetching User with id " + id);
		// TestCase testCase = testCaseService.findById(id);
		Project project = new Project();
		project.setId(1);
		project.setFunc_require("sfds");
		project.setNon_func_require("sds");
		project.setProjectName("sdsd");

		TestSuite suite = new TestSuite();
		suite.setTest_suit_name("asd123");
		suite.setStatus(0);
		suite.setProject(project.getId());

		Set<TestSuite> suites = new HashSet<TestSuite>();
		suites.add(suite);
		
		TestCase testCase = new TestCase();

		testCase.setAlternative("alt");
		testCase.setDescription("asde");
		testCase.setOutcome("sda");
		testCase.setPrerequisite("pre");
		
		Set<TestCase> tcases = new HashSet<TestCase>();
			tcases.add(testCase);
		Set<TestStep> steps = new HashSet<TestStep>();
		TestStep step1 = new TestStep();
		step1.setTest_step("step1a");

		// step1.setTestcase(testCase);

		// testStepService.save(step1);

		TestStep step2 = new TestStep();
		step2.setTest_step("dsds");
		steps.add(step1);
		steps.add(step2);

		// testStepService.save(step1);
		// testCase.getTest_steps().add(step1);
		// testCase.setTest_steps(steps);
		// testCaseService.save(testCase);
		testCaseService.saveProjectSuites(project, suites,tcases,steps);
		

		return new ResponseEntity<TestCase>(testCase, HttpStatus.OK);
	}

	// -------------------Create a
	// User--------------------------------------------------------
	@RequestMapping(value = "/testCase/", method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody String json,UriComponentsBuilder ucBuilder) throws JsonProcessingException, IOException {
		System.out.println("JSON:" + json);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(json);
		Project proj=new Project();
		proj=mapper.convertValue(node.get("project"), Project.class);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/testCase34/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser34(@RequestBody Project project,@RequestBody Set<TestSuite> testSuites,
											@RequestBody Set<TestCase> testCases,
											@RequestBody Set<TestStep> testSteps,UriComponentsBuilder ucBuilder) {
		System.out.println("Creating Testsuite " + project.getId());
		
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/testCase1/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody String project,UriComponentsBuilder ucBuilder) throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Creating Testsuite " + project);
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(project);
		Project proj=new Project();
		proj=mapper.convertValue(node.get("project"), Project.class);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@RequestMapping(value = "/testCase2/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser2(@RequestBody List<TestSuite> testSuites,UriComponentsBuilder ucBuilder) {
		System.out.println("Creating Testsuite " + testSuites);
		
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	// ------------------- Update a User
	// --------------------------------------------------------
	@RequestMapping(value = "/testCase/{id}", method = RequestMethod.PUT)
	public ResponseEntity<TestCase> updateUser(@PathVariable("id") int id, @RequestBody TestCase testCase) {
		System.out.println("Updating TestCase " + id);

		TestCase current = testCaseService.findById(id);
		if (current == null) {
			System.out.println("TestCase with id " + id + " not found");
			return new ResponseEntity<TestCase>(HttpStatus.NOT_FOUND);
		}
		/*
		 * current.setFunc_require(testCase.getFunc_require());
		 * current.setNon_func_require(testCase.getNon_func_require());
		 * current.setTest_suit_id(testCase.getTest_suit_id());
		 */
		testCaseService.update(current);
		return new ResponseEntity<TestCase>(current, HttpStatus.OK);
	}
}