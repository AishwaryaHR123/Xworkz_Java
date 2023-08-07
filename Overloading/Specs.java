package com.xworkz.Overloading;

public class Specs {
	public void lens()
	{
		System.out.println("invoking lens  in Specs");
		lens("LensKart");
		lens(false);
	}
	public void lens(String brand)
	{
		System.out.println("invoking lens,String in Specs");
		System.out.println("Brand is:"+brand);
	}
	public boolean lens(boolean visible)
	{
		System.out.println("invoking lens,boolean in Specs");
		System.out.println("Visible:"+visible);
		return true;
	}
	public void lens(String brand,boolean visible)
	{
		System.out.println("invoking String,boolean,lens in Specs");
		lens(brand);
		lens(visible);
	}

}

