package com.xworkz.Overloading;

public class IronBox {
	public void heat()
	{
		System.out.println("invoking heat in IronBox");
		heat("bajaj");
		heat(300);
	}
	public void heat(String brand)
	{
		System.out.println("invoking heat,String in IronBox");
		System.out.println("Brand is :"+brand);
	}
	public void heat(double price)
	{
		System.out.println("invoking heat,double in IronBox");
		System.out.println("Price is:"+price);
	}
	public void heat(String brand,double price)
	{
		System.out.println("invoking String,double,heat in IronBox");
		heat(brand);
		heat(price);
	}

}
