package com.xworkz.Polymorphism;

public class Library {
	public void study()
	{
		System.out.println("invoking no-args in Library");
	}
	public void study(String type)
	{
		System.out.println("invoking String in Library");
	}
	public void study(String type,String location)
	{
		System.out.println("invoking String,String in Library");
	}
	public void study(String type,String location,int noOfBook)
	{
		System.out.println("invoking String,String,int in Library");
	}
	public void study(String type,String location,int noOfBook,int noOfStaff)
	{
		System.out.println("invoking String,String,int,int in Library");
	}
	public void study(String type,String location,int noOfBook,int noOfStaff,int since)
	{
		System.out.println("invoking String,String,int,int,int in Library");
	}

}
