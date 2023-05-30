package com.group2.miniproject.MovieBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group2.miniproject.MovieBooking.entities.BookTicket;
import com.group2.miniproject.MovieBooking.repository.BookingRepository;
import com.group2.miniproject.MovieBooking.service.BookingService;
import com.group2.miniproject.MovieBooking.util.SequenceGeneratorService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService service;
	
	
	@Autowired
	BookingRepository repo;


	@RequestMapping(value="/viewBookingDetails/{confirmationId}", method=RequestMethod.GET)
	public BookTicket viewBookingDetails(@PathVariable int confirmationId)
	{
		return service.getBookTicketById(confirmationId);
	}


	@RequestMapping(value="/viewBookingDetails", method=RequestMethod.POST)
	public BookTicket createBookingDetails(@RequestBody BookTicket Bookticket)
	{
		return service.createBookTicket(Bookticket);
	}


	@RequestMapping(value="/getticket",method=RequestMethod.GET)
	public List<BookTicket> getBookTicket()
	{
		
		return service.getBookTicket();
	}
	
	@RequestMapping(value="/viewBookingDetails/{confirmationId}",method=RequestMethod.DELETE)
	public void deleteBookedTicket(@PathVariable int confirmationId)
	{
		service.deleteBookedTicket(confirmationId);
	}

}
