package com.vaishnavi.movieschedule.service;

import java.util.Date;
import java.util.List;

import com.vaishnavi.movieschedule.model.MovieSchedule;

public interface MovieScheduleService {
	public MovieSchedule saveMovieSchedule(MovieSchedule movieSchedule);
	public String deleteMovieSchedule(String id);
	public MovieSchedule updateMovieSchedule(MovieSchedule movieSchedule);
	public List<MovieSchedule> getMovies(String date);
	public List<MovieSchedule> getAllMovieSchedule();
}
