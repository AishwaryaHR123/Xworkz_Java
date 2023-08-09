package com.xworkz.Polymorphism;

public class PoliceStationInfo extends PoliceStation {
	@Override
	public void security() {
		System.out.println("PoliceStationInfo overrides PoliceStation");
		super.security();
	}

	@Override
	public void security(String name) {
		super.security(name);
	}

	@Override
	public void security(String name, String location) {
		super.security(name, location);
	}

	@Override
	public void security(String name, String location, int noOfOfficer) {
		super.security(name, location, noOfOfficer);
	}

	@Override
	public void security(String name, String location, int noOfOfficer, int noOfComplaints) {
		super.security(name, location, noOfOfficer, noOfComplaints);
	}

	@Override
	public void security(String name, String location, int noOfOfficer, int noOfComplaints, int since) {
		super.security(name, location, noOfOfficer, noOfComplaints, since);
	}

}
