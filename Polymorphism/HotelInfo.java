package com.xworkz.Polymorphism;

public class HotelInfo extends Hotel {
	@Override
	public void food() {
		System.out.println("HotelInfo overrides the Hotel");
		super.food();
	}

	@Override
	public void food(String hotelName) {
		super.food(hotelName);
	}

	@Override
	public void food(String hotelName, int noOfEmployees) {
		super.food(hotelName, noOfEmployees);
	}

	@Override
	public void food(String hotelName, int noOfEmployees, double bill) {
		super.food(hotelName, noOfEmployees, bill);
	}

	@Override
	public void food(String hotelName, int noOfEmployees, double bill, String location) {
		super.food(hotelName, noOfEmployees, bill, location);
	}

	@Override
	public void food(String hotelName, int noOfEmployees, double bill, String location, String menu) {
		super.food(hotelName, noOfEmployees, bill, location, menu);
	}

}
