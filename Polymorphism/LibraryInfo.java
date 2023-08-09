package com.xworkz.Polymorphism;

public class LibraryInfo extends Library {
	@Override
	public void study() {
		System.out.println("LibraryInfo overrides Library");
		super.study();
	}

	@Override
	public void study(String type) {
		super.study(type);
	}

	@Override
	public void study(String type, String location) {
		super.study(type, location);
	}

	@Override
	public void study(String type, String location, int noOfBook) {
		super.study(type, location, noOfBook);
	}

	@Override
	public void study(String type, String location, int noOfBook, int noOfStaff) {
		super.study(type, location, noOfBook, noOfStaff);
	}

	@Override
	public void study(String type, String location, int noOfBook, int noOfStaff, int since) {
		super.study(type, location, noOfBook, noOfStaff, since);
	}

}
