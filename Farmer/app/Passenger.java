package com.xworkz.Farmer.app;

public class Passenger {
	private int noOfPassenger;
	Bus bus;

	public void Passenger(int noOfPassenger) {
		System.out.println("Invoking const in passenger");
	}

	public void travel() {
		System.out.println("Invoking travel method in passenger");
		this.bus.move();
	}
	public void setBus(Bus bus) {
		System.out.println("Invoking set method in passenger");

	}
}
