package com.xworkz.Polymorphism;

public class HostelInfo extends Hostel {
	@Override
	public void security() {
		System.out.println("HostelInfo overrides Hostel");
		super.security();
	}

	@Override
	public void security(String hostelName) {
		super.security(hostelName);
	}

	@Override
	public void security(String hostelName, String location) {
		super.security(hostelName, location);
	}

	@Override
	public void security(String hostelName, String location, double feeStructure) {
		super.security(hostelName, location, feeStructure);
	}

	@Override
	public void security(String hostelName, String location, double feeStructure, int noOfStudents) {
		super.security(hostelName, location, feeStructure, noOfStudents);
	}

	public HostelInfo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void security(String hostelName, String location, double feeStructure, int noOfStudents, String food) {
		super.security(hostelName, location, feeStructure, noOfStudents, food);
	}

}
