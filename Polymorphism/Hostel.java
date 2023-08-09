package com.xworkz.Polymorphism;

public class Hostel {
	public void security()
	{
		System.out.println("invoking no-args in Security");
	}
	public void security(String hostelName)
	{
		System.out.println("invoking String in Security");
	}
	public void security(String hostelName,String location)
	{
		System.out.println("invoking String,String in Security");
	}
	public void security(String hostelName,String location,double feeStructure)
	{
		System.out.println("invoking String,String,double in Security");
	}
	public void security(String hostelName,String location,double feeStructure,int noOfStudents)
	{
		System.out.println("invoking String,String,double,int in Security");
	}
	public void security(String hostelName,String location,double feeStructure,int noOfStudents,String food)
	{
		System.out.println("invoking String,String,double,int,String in Security");
	}
	
	
	
	

}
