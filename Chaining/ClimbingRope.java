package com.xworkz.Chaining;

public class ClimbingRope extends Rope {
	public ClimbingRope()
	{
		this(50,"Red",35,"nylon");
		System.out.println("invoking no-args in ClimbingRope");
	}

	public ClimbingRope(double price, String color, int length, String material) {
		super(price, color, length, material);
		System.out.println("invokig double,String,int,String in ClimbingRope");
	}

}
