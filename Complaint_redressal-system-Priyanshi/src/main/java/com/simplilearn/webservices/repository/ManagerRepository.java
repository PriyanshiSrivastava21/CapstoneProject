package com.simplilearn.webservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.webservices.model.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Integer> {
	
	public Iterable<Manager> deleteByManagername(String Managername);
	public Manager findByManagername(String Managername);    

}
