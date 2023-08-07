package com.xworkz.Overloading;

public class Elevator {
	public void carry()
	{
		System.out.println("invoking carry in Elevator");
		carry(true);
		carry(30);
	}
	public void carry(int speed)
	{
		System.out.println("invoking carry,int in Elevator");
		System.out.println("Elevator Speed is:"+speed);
	}
	public boolean carry(boolean alarmStatus)
	{
		System.out.println("invoking carry,boolean in Elevator");
		System.out.println("Stapler price:"+alarmStatus);
		return true;
	}
	public void carry(int speed,boolean alarmStatus)
	{
		System.out.println("invoking carry,int,boolean in Elevator");
		carry(speed);
		carry(alarmStatus);
	}

}

