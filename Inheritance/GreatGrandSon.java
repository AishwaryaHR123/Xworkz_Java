package com.xworkz.Inheritance;

public class GreatGrandSon extends GrandSon {
	public String fatherName;
	public GreatGrandSon()
	{
		System.out.println("invoking no-args in GreatGrandSon");
	}
	public void greatGrandSonInfo()
	{
		System.out.println("invoking greatGrandSonInfo in GreatGrandSon");
	}

}
