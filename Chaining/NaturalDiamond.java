package com.xworkz.Chaining;

public class NaturalDiamond extends Diamond{
	public NaturalDiamond()
	{
		this("Kohinoor",35000,"Indiranagar",25);
		System.out.println("invoking no-args in NaturalDiamond");
	}

	public NaturalDiamond(String name, int price, String address, int weight) {
		super(name,price,address,weight);
		System.out.println("invoking String,double,String,int in NaturalDiamond");
	}
	

}
