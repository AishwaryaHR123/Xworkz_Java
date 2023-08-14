package com.xworkz.Abstract;

public abstract class Phone {
	public boolean cameraGood()
	{
		System.out.println("invoking Camera in Phone");
		return true;
	}
	public void music()
	{
		System.out.println("invoking music in Phone");
	}
	public void gps()
	{
		System.out.println("invoking gps in Phone");
	}
	public void calculate()
	{
		System.out.println("invoking calculate in Phone");
	}

	public abstract void call();
	public abstract void text();
	public abstract boolean hotspot();
	public abstract void email();
	public abstract void browsing();
	

}
