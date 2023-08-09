package com.xworkz.Polymorphism;

public class PoliceStation {
	public void security() {
		System.out.println("invoking no-args in Security");
	}

	public void security(String name) {
		System.out.println("invoking String in Security");
	}

	public void security(String name, String location) {
		System.out.println("invoking String,String in Security");
	}

	public void security(String name, String location, int noOfOfficer) {
		System.out.println("invoking String,String,int in Security");
	}

	public void security(String name, String location, int noOfOfficer, int noOfComplaints) {
		System.out.println("invoking String,String,int,int in Security");
	}

	public void security(String name, String location, int noOfOfficer, int noOfComplaints, int since) {
		System.out.println("invoking String,String,int,int,int in Security");
	}

}
