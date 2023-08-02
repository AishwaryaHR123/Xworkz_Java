package com.xworkz.Inheritance;

public class GreatGrandFather extends Family {
	public int age;
	public GreatGrandFather()
	{
		System.out.println("invoking no-args in GreatGrandFather");
	}
	public void greatGrandInfo()
	{
		System.out.println("invoking greatGrandInfo in GreatGrandFather");
	}

}
