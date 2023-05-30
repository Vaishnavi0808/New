package com.cg.sarode.ems.exceptions;

import java.util.List;

public class EmployeeException {
	
	private String message;
	private List<String> details;
	
	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeException(String message, List<String> details) {
		super();
		this.message = message;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getDetails() {
		return details;
	}

	public void setDetails(List<String> details) {
		this.details = details;
	}
	
	

}
