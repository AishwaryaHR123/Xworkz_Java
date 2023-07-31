package com.xworkz.AssocProgram;

public class Ingredient {
	public String ingredientName;
	public int quantity;
	public double cost;
	public Ingredient(String ingredientName,int quantity,double cost)
	{
		this.ingredientName=ingredientName;
		this.quantity=quantity;
		this.cost=cost;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Ingredient");
		System.out.println("Ingredients name:"+this.ingredientName);
		System.out.println("Quantity is:"+this.quantity);
		System.out.println("Cost odf Ingredient:"+this.cost);
	}

}
