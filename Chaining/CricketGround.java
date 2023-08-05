package com.xworkz.Chaining;

public class CricketGround extends Ground{
	public CricketGround()
	{
		this("RamMandir",50,12,"Rajajinagar");
		System.out.println("invoking no-args in CricketGround");
	}
	

	public CricketGround(String name, int dimension, int noOfPlayer, String location) {
		super(name, dimension, noOfPlayer, location);
		System.out.println("invoking String,int,int,String in CricketGround");
	}

}
