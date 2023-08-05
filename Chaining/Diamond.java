package com.xworkz.Chaining;

public class Diamond {
	public String name;
	public double price;
	public String address;
	public int weight;
	public Diamond(String name,double price,String address,int weight)
	{
		System.out.println("invoking String,double,String,int in Diamond");
		this.name=name;
		this.price=price;
		this.address=address;
		this.weight=weight;
	}

}
