package com.vaishnavi.movieschedule.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vaishnavi.movieschedule.model.MovieSchedule;

public interface MovieScheduleRepository extends MongoRepository<MovieSchedule, String>  {
	MovieSchedule findByDate(String date);
	List<MovieSchedule> findAllMoviesByDate(String date);
}
