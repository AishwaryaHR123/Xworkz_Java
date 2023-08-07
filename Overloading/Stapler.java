package com.xworkz.Overloading;

public class Stapler {
	public void binding()
	{
		System.out.println("invoking binding in Stapler");
		binding("Electric");
		binding(300);
	}
	public void binding(String type)
	{
		System.out.println("invoking binding,String in Stapler");
		System.out.println("Stapler Type is:"+type);
	}
	public void binding(double price)
	{
		System.out.println("invoking binding,double in Stapler");
		System.out.println("Stapler price:"+price);
	}
	public void binding(String type,double price)
	{
		System.out.println("invoking binding,String,double in Stapler");
		binding(type);
		binding(price);
	}

}


