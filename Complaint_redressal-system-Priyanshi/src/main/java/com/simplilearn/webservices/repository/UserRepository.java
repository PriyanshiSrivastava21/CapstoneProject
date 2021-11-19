package com.simplilearn.webservices.repository;

import org.springframework.data.repository.CrudRepository;

import com.simplilearn.webservices.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	

	public Iterable<User> deleteByUsername(String Username);
	public User findByUsername(String Username);        //abstract method
}
