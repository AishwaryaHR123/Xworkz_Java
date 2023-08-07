package com.xworkz.Overloading;

public class Plier {
	public void cut()
	{
		System.out.println("invoking cut in Plier");
		cut(10);
		cut(300.00);
	}
	public void cut(int length)
	{
		System.out.println("invoking cut,int in Plier");
		System.out.println("Plier length is:"+length);
	}
	public void cut(double price)
	{
		System.out.println("invoking cut,double in Plier");
		System.out.println("Plier price:"+price);
	}
	public void cut(int length,double price)
	{
		System.out.println("invoking cut,int,double in Plier");
		cut(length);
		cut(price);
	}

}


