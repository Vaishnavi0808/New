package com.cg.sarode.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sarode.ems.exceptions.RecordNotFoundException;
import com.cg.sarode.ems.model.Employee;
//import com.cg.sarode.ems.repository.AddressDAO;
import com.cg.sarode.ems.repository.EmpDAO;
import com.cg.sarode.ems.util.SequenceGeneratorService;

@Service
public class EmpService {
	
	@Autowired
	EmpDAO empdao;
	
	@Autowired
	private SequenceGeneratorService generator;
	 
	//CREATE
	public Employee createEmployee(Employee emp) 
	{
		emp.setId(generator.getSequenceNumber(Employee.SEQUENCE_NAME));
		return empdao.save(emp);
		
	}
	
	//READ
	public List<Employee> getEmployee()
	{
		if(empdao.findAll().isEmpty())
		{
			throw new RecordNotFoundException("Collection is Empty");
		}
		return empdao.findAll();
	}
	
	//DELETE
	public void deleteEmployee(int empId)
	{
		if(empdao.findById(empId).isEmpty())
		{
			throw new RecordNotFoundException("Id does not exist");
		}
		empdao.deleteById(empId);
	}
	
	//UPDATE
	public Employee updateEmployee(int empId, Employee empDetails)
	{
		Employee emp=empdao.findById(empId).get();
		emp.setName(empDetails.getName());
		emp.setDepartment(empDetails.getDepartment());
		emp.setDesignation(empDetails.getDesignation());
		emp.setAddress(empDetails.getAddress());
		
		
		return empdao.save(emp);
		
	}

	public List<Employee> getAddress() {
		
		return empdao.findAll();
	}

	public Employee getEmployeeById(int empId)
	{
		if(empdao.findById(empId).isEmpty())
		{
			throw new RecordNotFoundException("Employee does not exist");
		}
		return empdao.findById(empId).get();
		
	}
	
	

}
