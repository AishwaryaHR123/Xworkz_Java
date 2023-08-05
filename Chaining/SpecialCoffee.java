package com.xworkz.Chaining;

public class SpecialCoffee extends Coffee{
	public SpecialCoffee()
	{
		this(300,"StarBucks",true,"Milk");
		System.out.println("invoking no-args in SpecialCoffee");
	}

	public SpecialCoffee(double price, String brand, boolean tasty, String Ingredient) {
		super(price, brand, tasty, Ingredient);
		System.out.println("invoking double,String,boolean,String in SpecialCoffee");
	}

}
