package com.dmt.moviecatalogue.controller;

import java.util.Date;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="movie-schedule")
public interface MovieScheduleProxy {
	
	@GetMapping("/allMovieSchedule")
	public List<MovieSchedule> findAllMovieSchedule();
	
	@GetMapping("/findallMovieByDate/{date}")
	public List<MovieSchedule> findAllMovieByDate(@PathVariable @DateTimeFormat(pattern="dd-MM-yyyy") Date date);

	@PostMapping("/allMovieSchedule")
	public MovieSchedule addMovieSchedule(@RequestBody MovieSchedule movieSchedule);
	
}
