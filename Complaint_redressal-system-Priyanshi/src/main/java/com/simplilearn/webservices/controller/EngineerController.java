package com.simplilearn.webservices.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.simplilearn.webservices.model.Engineer;
import com.simplilearn.webservices.service.EngineerService;


@org.springframework.web.bind.annotation.RestController
public class EngineerController {
	
	@Autowired
	private EngineerService service;
	
	@PostMapping("/save-engineer")
	@Transactional
	@CrossOrigin
	public String registerEngineer(@RequestBody Engineer engineer) {
		service.saveMyEngineer(engineer);
		return "Hello " +engineer.getFirstname()+" your register successfully!!";
		
	}
	
	@GetMapping("/all-engineer")
	public Iterable<Engineer> showAllEngineer(){
		return service.showAllEngineer();
	}
	
	@GetMapping("/delete/{engineername}")
	@Transactional
	public Iterable<Engineer> deleteEngineer(@PathVariable String engineername){
		return service.deleteEngineerByEngineername(engineername);
	}
	
	@GetMapping("/search/{engineername}")
	@Transactional
	public Engineer searchEngineer(@PathVariable String engineername){
		return service.findByEngineername(engineername);
	}
}
