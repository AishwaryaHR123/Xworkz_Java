package com.xworkz.Chaining;

public class Rope {
	public double price;
	public String color;
	public int length;
	public String material;
	public Rope(double price,String color,int length,String material)
	{
		System.out.println("invoking double,String,int,String in Rope");
		this.price=price;
		this.color=color;
		this.length=length;
		this.material=material;
	}

}
