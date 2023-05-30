package com.group2.miniproject.MovieBooking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.group2.miniproject.MovieBooking.entities.BookTicket;

@Repository
public interface BookingRepository extends MongoRepository<BookTicket, Integer>{
	
	//BookTicket viewBookingDetails(@PathVariable int confirmationId);

}
