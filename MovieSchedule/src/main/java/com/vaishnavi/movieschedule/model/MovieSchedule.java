package com.vaishnavi.movieschedule.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class MovieSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private String date;
	@NotBlank(message= "showTime should not be null")
	private String showTime;
	private String movieTitle;
	
	
	
	public MovieSchedule(String id, String date, @NotBlank(message = "showTime should not be null") String showTime,
			String movieTitle) {
		super();
		this.id = id;
		this.date = date;
		this.showTime = showTime;
		this.movieTitle = movieTitle;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getShowTime() {
		return showTime;
	}



	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}



	public String getMovieTitle() {
		return movieTitle;
	}



	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	
	
	
	
	

}
