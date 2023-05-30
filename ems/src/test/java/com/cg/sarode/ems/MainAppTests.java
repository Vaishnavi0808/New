package com.cg.sarode.ems;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.sarode.ems.model.Address;
import com.cg.sarode.ems.model.Employee;
import com.cg.sarode.ems.repository.EmpDAO;
import com.cg.sarode.ems.service.EmpService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainAppTests {

	@Autowired
	private EmpService service;
	
	@MockBean
	private EmpDAO empdao;
	
	@Test
	public void getEmpTest() 
	{
		when(empdao.findAll()).thenReturn(Stream.of(new Employee(101,"Vaishnavi","IT","Analyst",
				new Address(2,"Sai Darshan","4","Airoli Road","Navi Mumbai",200))).
				collect(Collectors.toList()));
		assertEquals(1, service.getEmployee().size());
	}

}
