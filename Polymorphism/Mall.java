package com.xworkz.Polymorphism;

public class Mall {
	public void shop() {
		System.out.println("invoking no-args in Shop");
	}

	public void shop(String mallName) {
		System.out.println("invoking String in Shop");
	}

	public void shop(String mallName, String loaction) {
		System.out.println("invoking String, String in Shop");
	}

	public void shop(String mallName, String loaction, boolean ParkingSpace) {
		System.out.println("invoking String, String, boolean in Shop");
	}

	public void shop(String mallName, String loaction, boolean ParkingSpace, int rating) {
		System.out.println("invoking String, String, boolean, int in Shop");
	}

	public void shop(String mallName, String loaction, boolean ParkingSpace, int rating, int noOfEmployee) {
		System.out.println("invoking String, String, boolean, int, int in Shop");
	}

}
