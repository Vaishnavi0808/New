package com.dmt.moviecatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dmt.moviecatalogue.exception.MovieNotFoundException;
import com.dmt.moviecatalogue.model.MovieCatalogue;
import com.dmt.moviecatalogue.service.MovieCatalogueService;

@RestController
@RequestMapping("/movie")
public class MovieCatalogueController {
	
	@Autowired
    private MovieCatalogueService movieService;
    
    @GetMapping("/all")
    public List<MovieCatalogue> getAllMovies() {
        return movieService.viewAllMovieTitles();
    }
    
    @PostMapping("/")
	public MovieCatalogue addMovie(@RequestBody MovieCatalogue movie){
		 return movieService.addMovie(movie);
		
	}
    
    @GetMapping("/{movieTitle}")
    public MovieCatalogue getMovieByTitle(@PathVariable String movieTitle) throws MovieNotFoundException {
        return movieService.getMovieByTitle(movieTitle);
    }
    
    @PutMapping("/{movieTitle}")
    public boolean updateMovieByTitle(@PathVariable String movieTitle, @RequestBody MovieCatalogue movie) throws MovieNotFoundException {
        return movieService.updateMovieByTitle(movieTitle, movie);
    }
    
    @DeleteMapping("/{movieTitle}")
    public boolean deleteMovieByTitle(@PathVariable String movieTitle) throws MovieNotFoundException {
        return movieService.deleteMovieByTitle(movieTitle);
    }
    
    

}
