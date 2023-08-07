package com.xworkz.Overloading;

public class Ladder {
	public void construct()
	{
		System.out.println("invoking construct in construct");
		construct("Wood");
		construct(30);
	}
	public void construct(String material)
	{
		System.out.println("invoking construct,String in construct");
		System.out.println("Ladder Material is:"+material);
	}
	public void construct(int length)
	{
		System.out.println("invoking construct,int in construct");
		System.out.println("Ladder Length:"+length);
	}
	public void construct(String material,int length)
	{
		System.out.println("invoking construct,String,int in construct");
		construct(material);
		construct(length);
	}

}

