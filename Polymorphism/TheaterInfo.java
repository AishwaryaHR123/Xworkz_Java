package com.xworkz.Polymorphism;

public class TheaterInfo extends Theater{
	@Override
	public void movie() {
		System.out.println("TheaterInfo overrides Theater");
		super.movie();
	}
	@Override
	public void movie(String theaterName) {
		super.movie(theaterName);
	}
	@Override
	public void movie(String theaterName, String location) {
		super.movie(theaterName, location);
	}
	@Override
	public void movie(String theaterName, String location, double ticket) {
		super.movie(theaterName, location, ticket);
	}
	@Override
	public void movie(String theaterName, String location, double ticket, String movieName) {
		super.movie(theaterName, location, ticket, movieName);
	}
	@Override
	public void movie(String theaterName, String location, double ticket, String movieName, String snack) {
		super.movie(theaterName, location, ticket, movieName, snack);
	}

}
