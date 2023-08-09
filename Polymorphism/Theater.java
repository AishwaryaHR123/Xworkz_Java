package com.xworkz.Polymorphism;

public class Theater {
	public void movie() {
		System.out.println("invoking no-args in movie");
	}

	public void movie(String theaterName) {
		System.out.println("invoking String in movie");
	}

	public void movie(String theaterName, String location) {
		System.out.println("invoking String,String in movie");
	}

	public void movie(String theaterName, String location, double ticket) {
		System.out.println("invoking String,String,double in movie");
	}

	public void movie(String theaterName, String location, double ticket, String movieName) {
		System.out.println("invoking String,String,double,String in movie");
	}

	public void movie(String theaterName, String location, double ticket, String movieName, String snack) {
		System.out.println("invoking String,String,double,String,String in movie");
	}

}
