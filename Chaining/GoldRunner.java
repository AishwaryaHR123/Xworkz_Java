package com.xworkz.Chaining;

public class GoldRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GoldRunner");
		Gold gold=new Gold("Anmol",30000,"Jaynagar",15);
		System.out.println(gold.shopName);
		System.out.println(gold.price);
		System.out.println(gold.shopLocation);
		System.out.println(gold.weight);
		System.out.println("...................................");
		GoldSmith goldSmith=new GoldSmith();
		System.out.println(goldSmith.shopName);
		System.out.println(goldSmith.price);
		System.out.println(goldSmith.shopLocation);
		System.out.println(goldSmith.weight);
		System.out.println("...................................");
		GoldSmith goldSmith1=new GoldSmith("Mahalakshmi",40000,"Chikkaballapura",25);
		System.out.println(goldSmith1.shopName);
		System.out.println(goldSmith1.price);
		System.out.println(goldSmith1.shopLocation);
		System.out.println(goldSmith1.weight);
		
		

	}

}
