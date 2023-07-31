package com.xworkz.AssocProgram;

public class Floor {
	public String floorName;
	public int floorNumber;
	public Floor(String floorName,int floorNumber)
	{
		this.floorName=floorName;
		this.floorNumber=floorNumber;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Floor ");
		System.out.println("FloorName :"+this.floorName);
		System.out.println("FloorNo :"+this.floorNumber);
	}

}
