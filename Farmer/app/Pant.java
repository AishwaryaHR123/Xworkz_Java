package com.xworkz.Farmer.app;

public class Pant {
	String brand;
	Zip zip;

	public void Pant(String brand) {
		System.out.println("Invoking const in pant");
		this.brand = brand;
	}

	public void size() {
		System.out.println("Invoking size method in pant");
		this.zip .fabricJoin();
	}
	public void setZip(Zip zip) {
		System.out.println("Invoking set method in Pant");

	}
}
