package com.xworkz.Polymorphism;

public class Bakery {
	public void cake() {
		System.out.println("invoking no-args in Cake");
	}

	public void cake(String name) {
		System.out.println("invoking String in Cake");
	}

	public void cake(String name, double price) {
		System.out.println("invoking String,double in Cake");
	}

	public void cake(String name, double price, String flavour) {
		System.out.println("invoking String,double,String in Cake");
	}

	public void cake(String name, double price, String flavour, String color) {
		System.out.println("invoking String,double,String,String in Cake");
	}

	public void cake(String name, double price, String flavour, String color, boolean tasty) {
		System.out.println("invoking String,double,String,String,boolean in Cake");
	}

}
