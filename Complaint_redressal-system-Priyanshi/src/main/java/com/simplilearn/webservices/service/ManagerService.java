package com.simplilearn.webservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.webservices.model.Manager;
import com.simplilearn.webservices.repository.ManagerRepository;

@Service
public class ManagerService {
	@Autowired
	private ManagerRepository repo;

	public ManagerService() {}
	
	public ManagerService(ManagerRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyManager(Manager manager) {
		repo.save(manager);
	}
	
	public Iterable<Manager> showAllManager(){
		return repo.findAll();
	}
	public Iterable<Manager> deleteManagerByManagername(String managername){
		repo.deleteByManagername(managername);
		return repo.findAll();
	}
	
	public Manager findByManagername(String managername){
		return repo.findByManagername(managername);
	}

}
