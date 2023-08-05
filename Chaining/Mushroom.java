package com.xworkz.Chaining;

public class Mushroom {
	public String color;
	public int quantity;
	public double price;
	public boolean edible;
	public Mushroom(String color,int quantity,double price,boolean edible)
	{
		System.out.println("invoking String,int,double,boolean in Mushroom");
		this.color=color;
		this.quantity=quantity;
		this.price=price;
		this.edible=edible;
	}

}
