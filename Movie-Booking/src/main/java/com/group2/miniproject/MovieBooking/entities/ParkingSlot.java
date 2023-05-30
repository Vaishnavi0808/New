package com.group2.miniproject.MovieBooking.entities;

import java.util.Date;

public class ParkingSlot {
	private String movieTitle;
	private Date movieDate;
	private String moviePlayTime;
	private boolean available;
	
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public Date getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(Date movieDate) {
		this.movieDate = movieDate;
	}
	public String getMoviePlayTime() {
		return moviePlayTime;
	}
	public void setMoviePlayTime(String moviePlayTime) {
		this.moviePlayTime = moviePlayTime;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public ParkingSlot() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ParkingSlot(String movieTitle, Date movieDate, String moviePlayTime, boolean available) {
		super();
		this.movieTitle = movieTitle;
		this.movieDate = movieDate;
		this.moviePlayTime = moviePlayTime;
		this.available = available;
	}
	@Override
	public String toString() {
		return "ParkingSlot [movieTitle=" + movieTitle + ", movieDate=" + movieDate + ", moviePlayTime=" + moviePlayTime
				+ ", available=" + available + "]";
	}
	
	


}
