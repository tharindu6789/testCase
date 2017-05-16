package com.testcase.controller;

import java.util.ArrayList;
import java.util.LinkedHashSet;
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

import com.testcase.model.Project;
import com.testcase.service.PriorityTestService;
import com.testcase.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService; // Service which will do all data
									// retrieval/manipulation work

	// -------------------Retrieve All
	// Users--------------------------------------------------------
	@RequestMapping(value = "/project/", method = RequestMethod.GET)
	public ResponseEntity<List<Project>> listAllUsers() {
		List<Project> projects = projectService.getAllData();
		if (projects.isEmpty()) {
			return new ResponseEntity<List<Project>>(HttpStatus.NO_CONTENT);// You
																			// many
																			// decide
																			// to
																			// return
																			// HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Project>>(projects, HttpStatus.OK);
	}

	// -------------------Retrieve Single
	// User--------------------------------------------------------
	@RequestMapping(value = "/project/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Project> getUser(@PathVariable("id") int id) {
		System.out.println("Fetching User with id " + id);
		Project project = projectService.findById(id);
		if (project == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Project>(project, HttpStatus.OK);
	}

	// -------------------Create a
	// User--------------------------------------------------------
	@RequestMapping(value = "/project/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody Project project, UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + project.getProjectName());
		project.setStatus(1);
		projectService.save(project);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	// ------------------- Update a User
	// --------------------------------------------------------
	@RequestMapping(value = "/project_update/", method = RequestMethod.POST)
	public ResponseEntity<Project> updateUser(@RequestBody Project project) {
		System.out.println("Updating Project " + project.getId());

		Project current = projectService.findById(project.getId());
		if (current == null) {
			System.out.println("Project with id " + project.getId() + " not found");
			return new ResponseEntity<Project>(HttpStatus.NOT_FOUND);
		}

		// System.out.println("TESTCASE:"+
		// projectService.GenerateTestCase(project.getFunc_require()));
		current.setNon_func_require(project.getNon_func_require());
		current.setFunc_require(project.getFunc_require());
		projectService.update(current);
		return new ResponseEntity<Project>(current, HttpStatus.OK);
	}

	@RequestMapping(value = "/project_testcase/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<ArrayList<String>>> GenerateTestCase(@PathVariable("id") int id) {
		System.out.println("Generating Testcase " + id);

		Project current = new Project();
		current = projectService.findById(id);
		if (current == null) {
			System.out.println("Project with id " + id + " not found");
			return new ResponseEntity<ArrayList<ArrayList<String>>>(HttpStatus.NOT_FOUND);
		}
		String paragraphs = current.getFunc_require();
		String[] scenes = paragraphs.split("\\r?\\n");

		ArrayList<ArrayList<String>> testListAll = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < scenes.length; i++) {
			ArrayList<String> testList = new ArrayList<String>();
			System.out.println("scen" + i + ":" + scenes);
			// pass the
																	// spilt
																	// paragraph
			String new_para="";
			String description = projectService.getTCByRule2("tc_description", scenes[i]);
			String prerequisite = projectService.getTCByRule2("prerequisite", scenes[i]);
			String altenative = projectService.getTCByRule2("tc_alternative", scenes[i]);
			String expected_result = projectService.getTCByRule2("tc_outcome", scenes[i]);
			
			String input = scenes[i];
			String paragraph[] = input.split("\\.");
			
			String[] split1 = description.split("BBB");
			String[] split2 = prerequisite.split("BBB");
			String[] split3 = altenative.split("BBB");
			String[] split4 = expected_result.split("BBB");
			
			/*new_para=new_para.replace(description, "").replace(prerequisite, "")
					.replace(altenative, "").replace(expected_result, "");*/
			if(description !="" && prerequisite != "" && altenative != "" && expected_result != ""){
			description = split1[1];
			prerequisite = split2[1];
			altenative = split3[1];
			expected_result = split4[1];
			}
			for (String sent : paragraph) {
				/*if (!sent.contains(description) && !sent.contains(prerequisite) && !sent.contains(altenative) 
						&& !sent.contains(expected_result) ) {
					
					new_para+=sent+".";
				}*/
				sent+= ".";
				if(sent.contains(description)){
					
				}else if(sent.contains(prerequisite)){
					
				}else if(sent.contains(altenative)){
					
				}else if(sent.contains(expected_result)){
					
				}else{
					new_para+=sent;
				}
			}
			testList = projectService.GenerateTestCase(new_para);
			testList.add(0, description);
			testList.add(1, prerequisite);
			testList.add(2, altenative);
			testList.add(3, expected_result);
			
			System.out.println("TESTCASE:>" + i + new_para);

			Set<String> hs = new LinkedHashSet<>(testList);
			// hs.addAll(testList);
			testList.clear();
			testList.addAll(hs);
			testListAll.add(testList);
		}

		return new ResponseEntity<ArrayList<ArrayList<String>>>(testListAll, HttpStatus.OK);
	}

	@RequestMapping(value = "/testcase_prerequisite/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<ArrayList<String>>> getPrerequisite(@PathVariable("id") int id) {
		System.out.println("get Prerequite " + id);

		Project current = new Project();
		current = projectService.findById(id);
		if (current == null) {
			System.out.println("Project with id " + id + " not found");
			return new ResponseEntity<ArrayList<ArrayList<String>>>(HttpStatus.NOT_FOUND);
		}
		String paragraphs = current.getFunc_require();
		String[] scenes = paragraphs.split("\\r?\\n");

		ArrayList<ArrayList<String>> preListAll = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < scenes.length; i++) {
			ArrayList<String> preList = new ArrayList<String>();
			System.out.println("scen" + i + ":" + scenes);
			preList = projectService.getPrequisite(scenes[i]);// pass the spilt
																// paragraph

			System.out.println("TESTCASE" + i + preList);

			Set<String> hs = new LinkedHashSet<>(preList);
			// hs.addAll(testList);
			preList.clear();
			preList.addAll(hs);
			preListAll.add(preList);
		}

		return new ResponseEntity<ArrayList<ArrayList<String>>>(preListAll, HttpStatus.OK);
	}
	@RequestMapping(value = "/testcase_rule/{rule}/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<ArrayList<String>>> getSentByRule(@PathVariable("rule") String rule,@PathVariable("id") int id) {
		System.out.println("get Prerequite" + id);

		Project current = new Project();
		current = projectService.findById(id);
		if (current == null) {
			System.out.println("Project with id " + id + " not found");
			return new ResponseEntity<ArrayList<ArrayList<String>>>(HttpStatus.NOT_FOUND);
		}
		String paragraphs = current.getFunc_require();
		ArrayList<ArrayList<String>> preListAll=projectService.getSentByRule(rule, paragraphs);

		return new ResponseEntity<ArrayList<ArrayList<String>>>(preListAll, HttpStatus.OK);
	}
	@RequestMapping(value = "/testcase_description/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<String>> getTestSuiteName(@PathVariable("id") int id) {
		System.out.println("get Prerequite" + id);

		Project current = new Project();
		current = projectService.findById(id);
		if (current == null) {
			System.out.println("Project with id " + id + " not found");
			return new ResponseEntity<ArrayList<String>>(HttpStatus.NOT_FOUND);
		}
		String paragraphs = current.getFunc_require();
		ArrayList<ArrayList<String>> preListAll=projectService.getSentByRule("tc_description", paragraphs);
		
		System.out.println("preListAll:"+preListAll.toString());
		ArrayList<String> tsList=new ArrayList<String>();
		for(int i=0; i<preListAll.size(); i++){
			String sentence= preListAll.get(i).get(0);
			System.out.println("PreSEnt:"+sentence);

			sentence=projectService.getTestSuiteDesc(sentence);
			tsList.add(sentence);
		}
		return new ResponseEntity<ArrayList<String>>(tsList, HttpStatus.OK);
	}
	@RequestMapping(value = "/testcase_name/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<String>> getTestCaseName(@PathVariable("id") int id) {
		System.out.println("get TestCaseName" + id);
		
		Project current = new Project();
		current = projectService.findById(id);
		if (current == null) {
			System.out.println("Project with id " + id + " not found");
			return new ResponseEntity<ArrayList<String>>(HttpStatus.NOT_FOUND);
		}
		String paragraphs = current.getFunc_require();
		ArrayList<ArrayList<String>> preListAll=projectService.getSentByRule("tc_outcome", paragraphs);
		
		System.out.println(preListAll.get(0));
		ArrayList<String> tsList=new ArrayList<String>();
		for(int i=0; i<preListAll.size(); i++){
			String sentence= preListAll.get(i).get(0);
			System.out.println(sentence);
			
			sentence=projectService.getTestCaseName(sentence);
			tsList.add(sentence);
		}
		return new ResponseEntity<ArrayList<String>>(tsList, HttpStatus.OK);
	}
	@RequestMapping(value = "/testcase_priorty", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> getPriroityTest() throws Exception {
		PriorityTestService priorityTest=new PriorityTestService();
		
		priorityTest.execute();
		return null;
		
	}
	
}