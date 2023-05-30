package com.group2.miniproject.MovieBooking.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group2.miniproject.MovieBooking.entities.BookTicket;
import com.group2.miniproject.MovieBooking.repository.BookingRepository;
import com.group2.miniproject.MovieBooking.util.SequenceGeneratorService;

@Service
public class BookingService {
	
	@Autowired
	BookingRepository repo;
	
	@Autowired
	private SequenceGeneratorService generator;
	
	
	// Method to view parking slot availability for a movie
//	public void viewParkingSlotAvailability(String movieTitle, String movieDate, String movieStartTime)
//	{
//		// Convert movieDate String to Date object
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date parsedDate;
//	try 
//	{
//		parsedDate = dateFormat.parse(movieDate);
//	} catch (Exception e) 
//	{
//		throw new IllegalArgumentException("Invalid date format. Please use dd/MM/yyyy format.");
//	}
	//throw new IllegalArgumentException("Invalid date format. Please use dd/MM/yyyy format.");
//}

	public List<BookTicket> getBookTicket() {
		return repo.findAll();
	}

	public BookTicket createBookTicket(BookTicket book) {
		book.setConfirmationId(generator.getSequenceNumber(BookTicket.SEQUENCE_NAME));
		return repo.save(book);
	}

	public BookTicket getBookTicketById(int confirmationId) {
		return repo.findById(confirmationId).get();
	}

	public void deleteBookedTicket(int confirmationId) {
		repo.deleteById(confirmationId);
		
	}
	
	

}
