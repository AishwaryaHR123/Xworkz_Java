package com.xworkz.Encapsulation;

public class Rapido {
	private String userName;
	private String currentLocation;
	private String dropLocation;
	private double cost;
	private boolean confiramtion;
	private String vehicle;
	private int rating;
	private long number;
	private String language;
	private int time;
	private String payMode;
	private boolean onTime;
	private int otp;
	private int rides;

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCurrentLocation() {
		return this.currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getDropLocation() {
		return this.dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public long getNumber() {
		return this.number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public int getOtp() {
		return this.otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	public String getPayMode() {
		return this.payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRides() {
		return this.rides;
	}

	public void setRides(int rides) {
		this.rides = rides;
	}

	public int getTime() {
		return this.time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getVehicle() {
		return this.vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public boolean isConfiramtion() {
		return this.confiramtion;
	}

	public void setConfiramtion(boolean confiramtion) {
		this.confiramtion = confiramtion;
	}

	public boolean isOnTime() {
		return this.onTime;
	}

	public void setOnTime(boolean onTime) {
		this.onTime = onTime;
	}

}