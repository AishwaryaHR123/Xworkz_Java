package com.xworkz.Overloading;

public class Umbrella {
	public void protect()
	{
		System.out.println("invoking protect in Umbrella");
		protect("Blue");
		protect(300);
	}
	public void protect(String color)
	{
		System.out.println("invoking protect,color in Umbrella");
		System.out.println("Umbrella Color is:"+color);
	}
	public void protect(double price)
	{
		System.out.println("invoking protect,price in Umbrella");
		System.out.println("Umbrella price:"+price);
	}
	public void protect(String color,double price)
	{
		System.out.println("invoking protect,color,price in Umbrella");
		protect(color);
		protect(price);
	}

}

