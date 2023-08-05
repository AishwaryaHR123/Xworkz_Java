package com.xworkz.Chaining;

public class DiamondRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in DiamondRunner");
		Diamond diamond=new Diamond("Argyle",45000,"hebbal",10);
		System.out.println(diamond.name);
		System.out.println(diamond.price);
		System.out.println(diamond.address);
		System.out.println(diamond.weight);
		System.out.println("..................................");
		NaturalDiamond naturalDiamond =new NaturalDiamond();
		System.out.println(naturalDiamond.name);
		System.out.println(naturalDiamond.price);
		System.out.println(naturalDiamond.address);
		System.out.println(naturalDiamond.weight);
		System.out.println(".................................");
		NaturalDiamond naturalDiamond1=new NaturalDiamond("Fancy-Blue",65000,"Malleshwaram",5);
		System.out.println(naturalDiamond1.name);
		System.out.println(naturalDiamond1.price);
		System.out.println(naturalDiamond1.address);
		System.out.println(naturalDiamond1.weight);
		

	}

}
