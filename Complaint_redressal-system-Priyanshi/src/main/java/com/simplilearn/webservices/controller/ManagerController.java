package com.simplilearn.webservices.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.simplilearn.webservices.model.Manager;
import com.simplilearn.webservices.service.ManagerService;


@org.springframework.web.bind.annotation.RestController
public class ManagerController {
	
	@Autowired
	private ManagerService service;
	
	@PostMapping("/save-manager")
	@Transactional
	@CrossOrigin
	public String registerManager(@RequestBody Manager manager) {
		service.saveMyManager(manager);
		return "Hello " +manager.getFirstname()+" your register successfully!!";
		
	}
	
	@GetMapping("/all-manager")
	public Iterable<Manager> showAllManager(){
		return service.showAllManager();
	}
	
	@GetMapping("/delete/{managername}")
	@Transactional
	public Iterable<Manager> deleteManager(@PathVariable String managername){
		return service.deleteManagerByManagername(managername);
	}
	
	@GetMapping("/search/{managername}")
	@Transactional
	public Manager searchManager(@PathVariable String managername){
		return service.findByManagername(managername);
	}
}
