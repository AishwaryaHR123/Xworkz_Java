package com.xworkz.Inheritance;

public class GrandFather extends GreatGrandFather{
	public String name;
	public GrandFather()
	{
		System.out.println("invoking no-args in GrandFather");
	}
	public void grandFatherInfo()
	{
		System.out.println("invoking grandFatherInfo in GrandFather");
	}

}
