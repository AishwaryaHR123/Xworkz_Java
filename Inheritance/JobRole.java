package com.xworkz.Inheritance;

public class JobRole extends Job {
	public String roleName;
	public JobRole()
	{
		System.out.println("invoking no-args in JobRole");
	}
	public void roleInfo()
	{
		System.out.println("invoking roleInfo in JobRole");
	}

}
