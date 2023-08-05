package com.xworkz.Chaining;

public class Ground {
	public String name;
	public int dimension;
	public int noOfPlayer;
	public String location;
	public Ground(String name,int dimension,int noOfPlayer,String location)
	{
		System.out.println("invoking String,int,int,String in Ground");
		this.name=name;
		this.dimension=dimension;
		this.noOfPlayer=noOfPlayer;
		this.location=location;
	}
	

}
