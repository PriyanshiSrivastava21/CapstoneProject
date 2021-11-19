package com.simplilearn.webservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.webservices.model.Engineer;

public interface EngineerRepository extends CrudRepository<Engineer, Integer> {
	
	public Iterable<Engineer> deleteByEngineername(String Engineername);
	public Engineer findByEngineername(String Engineername);    

}
