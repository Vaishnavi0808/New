package com.dmt.moviecatalogue.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmt.moviecatalogue.exception.MovieNotFoundException;
import com.dmt.moviecatalogue.model.MovieCatalogue;
import com.dmt.moviecatalogue.repository.MovieCatalogueRepository;

//import jakarta.validation.constraints.NotNull;

@Service
public class MovieCatalogueService {
	
	@Autowired
	MovieCatalogueRepository repo;
	
	//view all movies
	public List<MovieCatalogue> viewAllMovieTitles(){
		return repo.findAll();
	}
	
	//add movie
	public MovieCatalogue addMovie(MovieCatalogue movie){
		return repo.save(movie);
	}
	
	//view by title
	public MovieCatalogue getMovieByTitle( String movieTitle) throws MovieNotFoundException {
        Optional<MovieCatalogue> optionalMovie = repo.findByMovieTitle(movieTitle);
        if (optionalMovie.isPresent()) {
            return optionalMovie.get();
        } else {
            throw new MovieNotFoundException("Movie not found with title: " + movieTitle);
        }
    }
	
	//update movie by title
	public boolean updateMovieByTitle( String movieTitle, MovieCatalogue updatedMovie) throws MovieNotFoundException {
        
		MovieCatalogue existingMovie = getMovieByTitle(movieTitle);
      //existingMovie.setMovieTitle(updatedMovie.getMovieTitle());
        existingMovie.setMovieDescription(updatedMovie.getMovieDescription());
        existingMovie.setMovieGenre(updatedMovie.getMovieGenre());
        existingMovie.setMovieIMDBRating(updatedMovie.getMovieIMDBRating());
        repo.save(existingMovie);
        return true;
    }
	
	//delete movie 
	 public boolean deleteMovieByTitle( String movieTitle) throws MovieNotFoundException {
	        MovieCatalogue movie = getMovieByTitle(movieTitle);
	        repo.delete(movie);
	        return true;
	    }

}
