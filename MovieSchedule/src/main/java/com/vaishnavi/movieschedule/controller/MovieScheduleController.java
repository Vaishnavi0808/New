package com.vaishnavi.movieschedule.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.vaishnavi.movieschedule.Exception.MovieScheduleNotFoundException;
import com.vaishnavi.movieschedule.model.MovieSchedule;
import com.vaishnavi.movieschedule.service.MovieScheduleServiceImpl;

@RestController
public class MovieScheduleController {

    @Autowired
    private MovieScheduleServiceImpl service;
    
    @GetMapping("/allMovieSchedule")
    public List<MovieSchedule> findAllMovieSchedule() {
        return service.getAllMovieSchedule();
    }

    @PostMapping("/addMovieSchedule")
    public MovieSchedule addMovieSchedule(@RequestBody MovieSchedule movieSchedule) {
      return   service.saveMovieSchedule(movieSchedule);
        
    }

    @GetMapping("/findAllMoviesByDate/{date}")
    public List<MovieSchedule>findAllMoviesByDate(@PathVariable @DateTimeFormat(pattern="dd-MM-yyyy") String date) {
       return  service.getMovies(date);
   
    }

    @PutMapping("/updateMovieSchedule/{date}")
    public MovieSchedule updateMovieSchedule(@RequestBody @DateTimeFormat(pattern="dd-MM-yyyy") MovieSchedule movieSchedule) {
    	 try {
             return service.updateMovieSchedule(movieSchedule);
         } catch (MovieScheduleNotFoundException ex) {
             throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage(), ex);
         }
    }

    @DeleteMapping("/deleteMovieSchedule/{id}")
    public String deleteMovieSchedule(@PathVariable String id) {
    	try {
            service.deleteMovieSchedule(id);
            return "Movie schedule removed for id: " + id;
        } catch (EmptyResultDataAccessException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie schedule not found for id: " + id, ex);
        }
    }
    
    
   
}

