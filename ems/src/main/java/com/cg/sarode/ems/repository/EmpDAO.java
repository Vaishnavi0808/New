package com.cg.sarode.ems.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.sarode.ems.model.Employee;

@Repository
public interface EmpDAO extends MongoRepository<Employee,Integer> {

	
	

}
