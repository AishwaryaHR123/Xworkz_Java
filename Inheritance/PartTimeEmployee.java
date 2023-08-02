package com.xworkz.Inheritance;

public class PartTimeEmployee extends FullTime {
	public int timings;
	public PartTimeEmployee()
	{
		System.out.println("invoking no-args in PartTimeEmployee");
	}
	public void partTimeInfo()
	{
		System.out.println("invoking partTimeInfo in PartTimeEmployee");
	}

}
