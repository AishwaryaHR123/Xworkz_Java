package com.xworkz.Associate;

public class Hotel {
	public Cook cook;
	public void hotelLocation()
	{
		System.out.println("invoking hotelLocation in Hotel");
		if(this.cook!=null) {
			this.cook.name();
			
		}
		else {
			System.err.println("cook is null cannot invoke the hotelLocation");
		}
	}
	public void hotelAddress()
	{
		System.out.println("invoking hotelAddress in Hotel");
		if(this.cook!=null) {
			this.cook.experience();
			
		}
		else {
			System.err.println("cook is null cannot invoke the hotelAddress");
		}
	}

}
