package com.vaishnavi.movieschedule.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaishnavi.movieschedule.Exception.MovieScheduleNotFoundException;
import com.vaishnavi.movieschedule.dao.MovieScheduleRepository;
import com.vaishnavi.movieschedule.model.MovieSchedule;


@Service
public class MovieScheduleServiceImpl implements MovieScheduleService{
    @Autowired
    private MovieScheduleRepository repository;

    public MovieSchedule saveMovieSchedule(MovieSchedule movieSchedule) {
        return repository.save(movieSchedule);
    }

    public String deleteMovieSchedule(String id) {
    	repository.deleteById(id);
        return "Movie schedule removed for id: " + id;
    }

    public MovieSchedule updateMovieSchedule(MovieSchedule movieSchedule) {
        MovieSchedule existingMovie = repository.findByDate(movieSchedule.getDate());
        if (existingMovie == null) {
            throw new MovieScheduleNotFoundException("Movie schedule not found for date: " + movieSchedule.getDate());
        }
//        existingMovie.setStartsAt(movieSchedule.getStartsAt());
//        existingMovie.setEndsAt(movieSchedule.getStartsAt());
        return repository.save(movieSchedule);
    }

	public List<MovieSchedule> getMovies(String date) {
		return repository.findAllMoviesByDate(date);
	}
	
	
	public List<MovieSchedule> getAllMovieSchedule() {
		return repository.findAll();
	}

}
