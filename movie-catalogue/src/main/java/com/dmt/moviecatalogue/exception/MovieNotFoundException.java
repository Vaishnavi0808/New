package com.dmt.moviecatalogue.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class MovieNotFoundException extends RuntimeException{
	
	public MovieNotFoundException(String message) {
		super(message);
	}

}
