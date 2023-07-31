package com.xworkz.AssocProgram;

public class Building {
	public Floor[] floors;
	public Lift[] lifts;
	public Building(Floor[] floors,Lift[] lifts)
	{
		this.floors=floors;
		this.lifts=lifts;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Building");
		for(int index=0;index<this.floors.length;index++)
		{
			Floor ref2=floors[index];
			ref2.printInfo();
		}
		for(int index=0;index<this.lifts.length;index++)
		{
			Lift ref3=lifts[index];
			ref3.printInfo();
		}
	}
	

}
