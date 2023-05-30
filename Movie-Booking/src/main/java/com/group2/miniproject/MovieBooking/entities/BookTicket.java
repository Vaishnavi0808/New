package com.group2.miniproject.MovieBooking.entities;

import java.util.Date;

import jakarta.persistence.Id;
import jakarta.persistence.Transient;

public class BookTicket {
	
	@Id
	private int confirmationId;
	private String carNo;
	private String title;
	private Date movieDate;
	private String playTime;
	private String slotNo;
	
	@Transient
	public static final String SEQUENCE_NAME = "bookTicket_sequence";
	
	public BookTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookTicket(int confirmationId, String carNo, String title, Date movieDate, String playTime, String slotNo) {
		super();
		this.confirmationId = confirmationId;
		this.carNo = carNo;
		this.title = title;
		this.movieDate = movieDate;
		this.playTime = playTime;
		this.slotNo = slotNo;
	}

	public int getConfirmationId() {
		return confirmationId;
	}

	public void setConfirmationId(int confirmationId) {
		this.confirmationId = confirmationId;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(Date movieDate) {
		this.movieDate = movieDate;
	}

	public String getPlayTime() {
		return playTime;
	}

	public void setPlayTime(String playTime) {
		this.playTime = playTime;
	}

	public String getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(String slotNo) {
		this.slotNo = slotNo;
	}

	@Override
	public String toString() {
		return "BookTicket [confirmationId=" + confirmationId + ", carNo=" + carNo + ", title=" + title + ", movieDate="
				+ movieDate + ", playTime=" + playTime + ", slotNo=" + slotNo + "]";
	}
	
	
	
}