package com.xworkz.Associate;

public class PowerBank {
	public Battery battery;
	public void price()
	{
		System.out.println("invoking price in PowerBank");
		if(this.battery!=null)
		{
			this.battery.status();
		}
		else {
			System.err.println("battery is null cannot invoke the Price");
		}
	}
	public void brand()
	{
		System.out.println("invoking Brand in PowerBank");
		if(this.battery!=null)
		{
			this.battery.capacity();
		}
		else {
			System.err.println("battery is null cannot invoke the Brand");
		}
	}
	
	

}
