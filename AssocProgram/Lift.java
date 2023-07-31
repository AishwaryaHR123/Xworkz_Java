package com.xworkz.AssocProgram;

public class Lift {
	public int liftNo;
	public Lift(int liftNo)
	{
		this.liftNo=liftNo;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Lift");
		System.out.println("Lift Number is:"+this.liftNo);
	}
	

}
