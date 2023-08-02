package com.xworkz.Inheritance;

public class Employee extends JobRole{
	public int employeeId;
	public Employee()
	{
		System.out.println("invoking no-args in Employee");
	}
	public void employeeInfo()
	{
		System.out.println("invoking employeeInfo in Employee");
	}

}
