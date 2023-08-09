package com.xworkz.Polymorphism;

public class Hospital {
	public void treatment()
	{
		System.out.println("invoking no-args in treatment");
	}
	public void treatment(String hospitalName)
	{
		System.out.println("invoking String in treatment");
	}
	public void treatment(String hospitalName,int noOfDoctor)
	{
		System.out.println("invoking String,int in treatment");
	}
	public void treatment(String hospitalName,int noOfDoctor,String patientName)
	{
		System.out.println("invoking String,int,String in treatment");
	}
	public void treatment(String hospitalName,int noOfDoctor,String patientName,int noOfStaff)
	{
		System.out.println("invoking String,int,String,int in treatment");
	}
	public void treatment(String hospitalName,int noOfDoctor,String patientName,int noOfStaff,boolean clean)
	{
		System.out.println("invoking String,int,String,int,boolean in treatment");
	}
	
	
	

}
