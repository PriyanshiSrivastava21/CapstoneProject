package com.simplilearn.webservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.webservices.model.Engineer;
import com.simplilearn.webservices.repository.EngineerRepository;

@Service
public class EngineerService {
	@Autowired
	private EngineerRepository repo;

	public EngineerService() {}
	
	public EngineerService(EngineerRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveMyEngineer(Engineer engineer) {
		repo.save(engineer);
	}
	
	public Iterable<Engineer> showAllEngineer(){
		return repo.findAll();
	}
	public Iterable<Engineer> deleteEngineerByEngineername(String engineername){
		repo.deleteByEngineername(engineername);
		return repo.findAll();
	}
	
	public Engineer findByEngineername(String engineername){
		return repo.findByEngineername(engineername);
	}

}
