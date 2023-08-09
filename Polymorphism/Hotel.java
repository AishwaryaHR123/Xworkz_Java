package com.xworkz.Polymorphism;

public class Hotel {
	public void food() {
		System.out.println("invoking no-args in food");
	}

	public void food(String hotelName) {
		System.out.println("invoking String in food");
	}

	public void food(String hotelName, int noOfEmployees) {
		System.out.println("invoking String,int in food");
	}

	public void food(String hotelName, int noOfEmployees, double bill) {
		System.out.println("invoking String,int,double in food");
	}

	public void food(String hotelName, int noOfEmployees, double bill, String location) {
		System.out.println("invoking String,int,double,String in food");
	}

	public void food(String hotelName, int noOfEmployees, double bill, String location, String menu) {
		System.out.println("invoking String,int,double,String,String in food");
	}

}
