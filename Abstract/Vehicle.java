package com.xworkz.Abstract;

public abstract class Vehicle {
	public void accelerate()
	{
		System.out.println("invoking Accelerate in Vehicle");
	}
	public boolean light()
	{
		System.out.println("invoking light in Vehicle");
		return true;
	}
	public void brake()
	{
		System.out.println("invking brake in Vehicle");
	}
	public boolean security()
	{
		System.out.println("invoking security in Vehicle");
		return true;
	}
	public void control()
	{
		System.out.println("invoking Control in Vehicle");
	}
	public abstract boolean start();
	public abstract void stop();
	public abstract void steer();
	public abstract boolean voiceControl();
	public abstract void capacity();
	

}
