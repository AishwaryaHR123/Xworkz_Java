package com.xworkz.Polymorphism;

public class MallInfo extends Mall {
	@Override
	public void shop() {
		System.out.println("MallInfo overrides Mall");
		super.shop();
	}

	@Override
	public void shop(String mallName) {
		super.shop(mallName);
	}

	@Override
	public void shop(String mallName, String location) {
		super.shop(mallName, location);
	}

	@Override
	public void shop(String mallName, String location, boolean ParkingSpace) {
		super.shop(mallName, location, ParkingSpace);
	}

	@Override
	public void shop(String mallName, String location, boolean ParkingSpace, int rating) {
		super.shop(mallName, location, ParkingSpace, rating);
	}

	@Override
	public void shop(String mallName, String location, boolean ParkingSpace, int rating, int noOfEmployee) {
		super.shop(mallName, location, ParkingSpace, rating, noOfEmployee);
	}

}
