package com.xworkz.Encapsulation;

public class Irctc {
	private String trainName;
	private int trainNumber;
	private boolean booking;
	private int date;
	private int time;
	private int seatNumber;
	private String from;
	private String to;
	private int numberOfSeats;
	private int pricePerTicket;
	private String reservationType;
	private boolean seatAvailable;
	private boolean notification;
	private boolean seatConfirmation;

	public int getDate() {
		return this.date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getPricePerTicket() {
		return this.pricePerTicket;
	}

	public void setPricePerTicket(int pricePerTicket) {
		this.pricePerTicket = pricePerTicket;
	}

	public String getReservationType() {
		return this.reservationType;
	}

	public void setReservationType(String reservationType) {
		this.reservationType = reservationType;
	}

	public int getSeatNumber() {
		return this.seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTrainName() {
		return this.trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getTrainNumber() {
		return this.trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public boolean isBooking() {
		return this.booking;
	}

	public void setBooking(boolean booking) {
		this.booking = booking;
	}

	public boolean isNotification() {
		return this.notification;
	}

	public void setNotification(boolean notification) {
		this.notification = notification;
	}

	public boolean isSeatAvailable() {
		return this.seatAvailable;
	}

	public void setSeatAvailable(boolean seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public boolean isSeatConfirmation() {
		return this.seatConfirmation;
	}

	public void setSeatConfirmation(boolean seatConfirmation) {
		this.seatConfirmation = seatConfirmation;
	}

}
