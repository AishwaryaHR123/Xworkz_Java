package com.xworkz.Polymorphism;

public class BakeryInfo extends Bakery {
	@Override
	public void cake() {
		System.out.println("BakeryInfo overrides the Bakery");
		super.cake();
	}

	@Override
	public void cake(String name) {
		super.cake(name);
	}

	@Override
	public void cake(String name, double price) {
		super.cake(name, price);
	}

	@Override
	public void cake(String name, double price, String flavour) {
		super.cake(name, price, flavour);
	}

	@Override
	public void cake(String name, double price, String flavour, String color) {
		super.cake(name, price, flavour, color);
	}

	@Override
	public void cake(String name, double price, String flavour, String color, boolean tasty) {
		super.cake(name, price, flavour, color, tasty);
	}

}
