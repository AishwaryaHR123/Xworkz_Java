package com.xworkz.Chaining;

public class Gold {
	public String shopName;
	public double price;
	public String shopLocation;
	public int weight;
	public Gold(String shopName,double price,String shopLocation,int weight)
	{
		System.out.println("invoking String double,String,int in Gold");
		this.shopName=shopName;
		this.price=price;
		this.shopLocation=shopLocation;
		this.weight=weight;
	}
	

}
