 package com.dmt.moviecatalogue.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.dmt.moviecatalogue.controller.MovieSchedule;

@Document
public class MovieCatalogue {
	
	@Id
	private String movieTitle;
	private String movieDescription;
	private String movieGenre;
	private double movieIMDBRating;
	private MovieSchedule movieSchedule;
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public String getMovieGenre() {
		return movieGenre;
	}
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}
	public double getMovieIMDBRating() {
		return movieIMDBRating;
	}
	public void setMovieIMDBRating(double movieIMDBRating) {
		this.movieIMDBRating = movieIMDBRating;
	}
	public MovieSchedule getMovieSchedule() {
		return movieSchedule;
	}
	public void setMovieSchedule(MovieSchedule movieSchedule) {
		this.movieSchedule = movieSchedule;
	}
	public MovieCatalogue() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieCatalogue(String movieTitle, String movieDescription, String movieGenre, double movieIMDBRating,
			MovieSchedule movieSchedule) {
		super();
		this.movieTitle = movieTitle;
		this.movieDescription = movieDescription;
		this.movieGenre = movieGenre;
		this.movieIMDBRating = movieIMDBRating;
		this.movieSchedule = movieSchedule;
	}
	@Override
	public String toString() {
		return "MovieCatalogue [movieTitle=" + movieTitle + ", movieDescription=" + movieDescription + ", movieGenre="
				+ movieGenre + ", movieIMDBRating=" + movieIMDBRating + ", movieSchedule=" + movieSchedule + "]";
	}
	
	
	
}
