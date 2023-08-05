package com.xworkz.Chaining;

public class GoldSmith extends Gold{
	public GoldSmith() {
		this("SJR",25000,"Basavanagudi",20);
		System.out.println("invoking no-args in GoldSmith");
	}
	

	public GoldSmith(String shopName, double Price, String shopLocation, int weight) {
		super(shopName, Price, shopLocation, weight);
		System.out.println("invoking String,double,String,int in GoldSmith");
		
	}

}
