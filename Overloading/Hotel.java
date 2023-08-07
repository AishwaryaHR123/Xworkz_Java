package com.xworkz.Overloading;

public class Hotel {
	public void food()
	{
		System.out.println("invoking food in Hotel");
		food("Anmol");
		food(false);
	}
	public void food(String hotelName)
	{
		System.out.println("invoking food,String in Hotel");
		System.out.println("hotelName is :"+hotelName);
	}
	public boolean food(boolean clean)
	{
		System.out.println("invoking food,boolean in Hotel");
		System.out.println("Clean is:"+clean);
		return true;
	}
	public void food(String hotelName,boolean clean)
	{
		System.out.println("invoking String,boolean,food in Hotel");
		food(hotelName);
		food(clean);
	}

}

