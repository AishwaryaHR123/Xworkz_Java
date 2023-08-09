package com.xworkz.Polymorphism;

public class Temple {
	public void worship()
	{
		System.out.println("invoking no-args in worship");
	}
	public void worship(String templeName)
	{
		System.out.println("invoking String in worship");
	}
	public void worship(String templeName,int yearBuilt)
	{
		System.out.println("invoking String,int in worship");
	}
	public void worship(String templeName,int yearBuilt,String religion)
	{
		System.out.println("invoking String,int,String in worship");
	}
	public void worship(String templeName,int yearBuilt,String religion,String founder)
	{
		System.out.println("invoking String,int,String,String in worship");
	}
	public void worship(String templeName,int yearBuilt,String religion,String founder,String dressCode)
	{
		System.out.println("invoking String,int,String,String,String in worship");
	}
	
	

}
