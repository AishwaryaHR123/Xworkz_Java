package com.xworkz.Chaining;

public class PoisonMushroom extends Mushroom{
	public PoisonMushroom()
	{
		this("White",20,200,false);
		System.out.println("invoking no-args in PoisonMushroom");
	}

	public PoisonMushroom(String color, int quantity, double price, boolean edible) {
		super(color,quantity,price,edible);
		System.out.println("invoking String,int,double,boolean in PoisonMushroom");
		
	}

}
