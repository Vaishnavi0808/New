 package com.vaishnavi.movieschedule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vaishnavi.movieschedule.controller.MovieScheduleController;
import com.vaishnavi.movieschedule.dao.MovieScheduleRepository;
import com.vaishnavi.movieschedule.model.MovieSchedule;
import com.vaishnavi.movieschedule.service.MovieScheduleServiceImpl;

@SpringBootTest
class MovieScheduleApplicationTests {
	@Mock
    private MovieScheduleRepository repository;

    @InjectMocks
    private MovieScheduleServiceImpl service;
    
    @Mock
    MovieScheduleController movieScheduleController;

//    @Test
//    public void testGetMovies() {
//        Date date = new Date();
//        List<MovieSchedule> movieList = new ArrayList<MovieSchedule>();
//        movieList.add(new MovieSchedule("1", date, "12:00 PM", "2:00 PM"));
//        movieList.add(new MovieSchedule("2", date, "3:00 PM", "5:00 PM"));
//        when(repository.findAllMoviesByDate(date)).thenReturn(movieList);
//
//        List<MovieSchedule> result = service.getMovies(date);
//
//        assertEquals(2, result.size());
//        assertEquals("1", result.get(0).getId());
//        assertEquals(date, result.get(0).getDate());
//        assertEquals("12:00 PM", result.get(0).getStartsAt());
//        assertEquals("2:00 PM", result.get(0).getEndsAt());
//        assertEquals("2", result.get(1).getId());
//        assertEquals(date, result.get(1).getDate());
//        assertEquals("3:00 PM", result.get(1).getStartsAt());
//        assertEquals("5:00 PM", result.get(1).getEndsAt());
//    }
//
//    @Test
//    public void testSaveMovieSchedule() {
//        MovieSchedule movie = new MovieSchedule("1", new Date(), "12:00 PM", "2:00 PM");
//        when(repository.save(movie)).thenReturn(movie);
//
//        MovieSchedule result = service.saveMovieSchedule(movie);
//
//        assertEquals("1", result.getId());
//        assertEquals("12:00 PM", result.getStartsAt());
//        assertEquals("2:00 PM", result.getEndsAt());
//    }
//
//    @Test
//    public void testDeleteMovieSchedule() {
//        String id = "1";
//
//        String result = service.deleteMovieSchedule(id);
//
//        assertEquals("Movie schedule removed for id: 1", result);
//    }
//
//    @Test
//    public void testUpdateMovieSchedule() {
//        MovieSchedule existingMovie = new MovieSchedule("1", new Date(), "12:00 PM", "2:00 PM");
//        MovieSchedule updatedMovie = new MovieSchedule("1", new Date(), "3:00 PM", "5:00 PM");
//        when(repository.findByDate(updatedMovie.getDate())).thenReturn(existingMovie);
//        when(repository.save(updatedMovie)).thenReturn(updatedMovie);
//
//        MovieSchedule result = service.updateMovieSchedule(updatedMovie);
//
//        assertEquals("1", result.getId());
//        assertEquals("3:00 PM", result.getStartsAt());
//        assertEquals("5:00 PM", result.getEndsAt());
//    }

    
//    @Test
//    void testFindAllMoviesByDate() throws Exception {
//        String date = "01-01-2022";
//        List<MovieSchedule> schedules = new ArrayList<>();
//        schedules.add(new MovieSchedule("1", "01-01-2022", "15:00","Avengers"));
//
//        when(service.getMovies(date)).thenReturn(schedules);
//
//        ResponseEntity<List<MovieSchedule>> responseEntity = movieScheduleController.findAllMoviesByDate(date);
//
//        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
//        assertEquals(1, responseEntity.getBody().size());
//        assertEquals("1", responseEntity.getBody().get(0).getMovieTitle());
//        assertEquals("01-01-2022", responseEntity.getBody().get(0).getDate());
//        assertEquals("15:00", responseEntity.getBody().get(0).getShowTime());
//        assertEquals("Avengers", responseEntity.getBody().get(0).getMovieTitle());
//    }
//
//
//

}
