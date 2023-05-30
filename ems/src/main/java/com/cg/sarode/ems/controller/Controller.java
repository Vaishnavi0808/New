package com.cg.sarode.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.sarode.ems.model.Address;
import com.cg.sarode.ems.model.Employee;
import com.cg.sarode.ems.service.EmpService;

@RestController
public class Controller {
	
	@Autowired
	private EmpService service; 
	
	
	@RequestMapping(value="/employees",method=RequestMethod.POST)
	public Employee createEmployees(@RequestBody Employee emp)
	{
		return service.createEmployee(emp);
	}
	 
	@RequestMapping(value="/employees",method=RequestMethod.GET)
	public List<Employee> getEmployees()
	{
		
		return service.getEmployee();
	}
	
	@RequestMapping(value="/employees/{empId}",method=RequestMethod.PUT)
	public Employee updateEmployees(@PathVariable int empId,@RequestBody Employee empDetails)
	{
		return service.updateEmployee(empId, empDetails);
		
	}
	
	@RequestMapping(value="/employees/{empId}",method=RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable int empId)
	{
		service.deleteEmployee(empId);
	}
	
	@RequestMapping(value="/address",method=RequestMethod.GET)
	public List<Employee> getAddresses()
	{
		
		return service.getAddress();
	}
	
	@RequestMapping(value="/employees/{empId}",method=RequestMethod.GET)
	public Employee getSingleEmployee(@PathVariable int empId)
	{
		return service.getEmployeeById(empId);
	}
}
