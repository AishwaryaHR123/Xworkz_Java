package com.xworkz.Encapsulation;

public class Redbus {
	private String payment;
	private boolean sms;
	private String language;
	private int noOfUsers;
	private String bookingType;
	private double amount;
	private int noOfTicket;
	private boolean seatSelection;
	private String busTypes;
	private boolean discount;
	private String accountName;
	private String reviews;
	private boolean groupBooking;
	private String bookingId;

	public String getPayment() {
		return this.payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public boolean isSms() {
		return this.sms;
	}

	public void setSms(boolean sms) {
		this.sms = sms;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNoOfUsers() {
		return this.noOfUsers;
	}

	public void setNoOfUsers(int noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

	public String getBookingType() {
		return this.bookingType;
	}

	public void setBookingType(String bookingType) {
		this.bookingType = bookingType;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNoOfTicket() {
		return this.noOfTicket;
	}

	public void setNoOfTicket(int noOfTicket) {
		this.noOfTicket = noOfTicket;
	}

	public boolean isSeatSelection() {
		return this.seatSelection;
	}

	public void setSeatSelection(boolean seatSelection) {
		this.seatSelection = seatSelection;
	}

	public String getBusTypes() {
		return this.busTypes;
	}

	public void setBusTypes(String busTypes) {
		this.busTypes = busTypes;
	}

	public boolean isDiscount() {
		return this.discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getReviews() {
		return this.reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public boolean isGroupBooking() {
		return this.groupBooking;
	}

	public void setGroupBooking(boolean groupBooking) {
		this.groupBooking = groupBooking;
	}

	public String getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
}
