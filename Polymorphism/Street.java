package com.xworkz.Polymorphism;

public class Street {
	public void transportation()
	{
		System.out.println("invoking no-args in transportation");
	}
	public void transportation(String name)
	{
		System.out.println("invoking String in transportation");
	}
	public void transportation(String name,boolean parkingSpace)
	{
		System.out.println("invoking String,boolean in transportation");
	}
	public void transportation(String name,boolean parkingSpace,String landUse)
	{
		System.out.println("invoking String,boolean,String in transportation");
	}
	public void transportation(String name,boolean parkingSpace,String landUse,int noOfBuilding)
	{
		System.out.println("invoking String,boolean,String,int in transportation");
	}
	public void transportation(String name,boolean parkingSpace,String landUse,int noOfBuilding,String location)
	{
		System.out.println("invoking String,boolean,String,int,String in transportation");
	}
	

}
