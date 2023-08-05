package com.xworkz.Chaining;

public class Coffee {
	public double price;
	public String brand;
	public boolean tasty;
	public String Ingredient;
	public Coffee(double price,String brand,boolean tasty,String Ingredient)
	{
		System.out.println("invoking double,String,boolean,quantity in Coffee");
		this.price=price;
		this.brand=brand;
		this.tasty=tasty;
		this.Ingredient=Ingredient;
		
	}

}
