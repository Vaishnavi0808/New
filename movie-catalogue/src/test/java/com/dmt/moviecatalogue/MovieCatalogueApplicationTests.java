package com.dmt.moviecatalogue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.dmt.moviecatalogue.exception.MovieNotFoundException;
import com.dmt.moviecatalogue.model.MovieCatalogue;
import com.dmt.moviecatalogue.repository.MovieCatalogueRepository;
import com.dmt.moviecatalogue.service.MovieCatalogueService;

import junit.framework.Assert;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class MovieCatalogueApplicationTests {
	
	 @Mock
	    private MovieCatalogueRepository repo;

	    @InjectMocks
	    private MovieCatalogueService service;

//	    @Test
//	    public void testViewAllMovieTitles() {
//	        List<MovieCatalogue> movies = new ArrayList<>();
//	        movies.add(new MovieCatalogue("Movie1", "Description1", "Genre1", 8.0));
//	        movies.add(new MovieCatalogue("Movie2", "Description2", "Genre2", 7.5));
//	        Mockito.when(repo.findAll()).thenReturn(movies);
//
//	        List<MovieCatalogue> result = service.viewAllMovieTitles();
//	        Assert.assertEquals(2, result.size());
//	        Assert.assertEquals("Movie1", result.get(0).getMovieTitle());
//	        Assert.assertEquals("Movie2", result.get(1).getMovieTitle());
//	    }
//	    
//	    @Test
//	    public void testAddMovie() {
//	        MovieCatalogue expectedMovie = new MovieCatalogue("Title 1", "Description 1", "Genre 1", 8.0);
//	        when(repo.save(expectedMovie)).thenReturn(expectedMovie);
//
//	        MovieCatalogue actualMovie = service.addMovie(expectedMovie);
//
//	        assertEquals(expectedMovie, actualMovie);
//	    }
//	    
//	    @Test
//	    public void testGetMovieByTitleWithExistingMovie() throws MovieNotFoundException {
//	        String movieTitle = "Title 1";
//	        MovieCatalogue expectedMovie = new MovieCatalogue(movieTitle, "Description 1", "Genre 1", 8.0);
//	        when(repo.findByMovieTitle(movieTitle)).thenReturn(Optional.of(expectedMovie));
//
//	        MovieCatalogue actualMovie = service.getMovieByTitle(movieTitle);
//
//	        assertEquals(expectedMovie, actualMovie);
//	    }
//	    
//	    @Test
//	    public void testGetMovieByTitleWithNonexistentMovie() {
//	        String movieTitle = "Title 1";
//	        when(repo.findByMovieTitle(movieTitle)).thenReturn(Optional.empty());
//
//	        assertThrows(MovieNotFoundException.class, () -> {
//	            service.getMovieByTitle(movieTitle);
//	        });
//	    }
	    


}

