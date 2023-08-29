package com.xworkz.Farmer.app;

public class Shirt {
	private String brand;
	private Button button;

	public void Shirt(String brand) {
		System.out.println("invoking const in Shirt");
		this.brand = brand;
	}

	public void size() {
		System.out.println("Invoking size method in Shirt");
		this.button.color();
	}

	public void setButton(Button button) {
		System.out.println("Invoking set method in Shirt");
		this.button = button;
	}
}
