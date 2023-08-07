package com.xworkz.Overloading;

public class Mouse {
	public void move()
	{
		System.out.println("invoking move in Mouse");
		move("Dell");
		move(150);
	}
	public void move(String brand)
	{
		System.out.println("invoking move,String in Mouse");
		System.out.println("Mouse Brand is:"+brand);
	}
	public void move(double cost)
	{
		System.out.println("invoking move,double in Mouse");
		System.out.println("Mouse Cost price:"+cost);
	}
	public void move(String brand,double cost)
	{
		System.out.println("invoking move,String,double in Mouse");
		move(brand);
		move(cost);
	}

}

