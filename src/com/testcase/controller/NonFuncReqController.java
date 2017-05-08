package com.testcase.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testcase.model.Project;
import com.testcase.service.ProjectService;

@RestController
public class NonFuncReqController {
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping(value = "/non_testcase_rule/{rule}/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ArrayList<ArrayList<String>>> getNonSentByRule(@PathVariable("rule") String rule,@PathVariable("id") int id) {
		System.out.println("get Prerequite" + id);

		Project current = new Project();
		current = projectService.findById(id);
		if (current == null) {
			System.out.println("Project with id " + id + " not found");
			return new ResponseEntity<ArrayList<ArrayList<String>>>(HttpStatus.NOT_FOUND);
		}
		String paragraphs = current.getNon_func_require();
		ArrayList<ArrayList<String>> preListAll=projectService.getSentByRule(rule, paragraphs);

		return new ResponseEntity<ArrayList<ArrayList<String>>>(preListAll, HttpStatus.OK);
	}

}
