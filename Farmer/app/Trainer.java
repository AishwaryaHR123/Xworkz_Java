package com.xworkz.Farmer.app;

public class Trainer {
	private String name;
	private Laptop laptop;

	public void Trainer(String name) {
		this.name=name;

	}

	public void trainee() {
		System.out.println("Invoking trainee method in trainer ");
		this.laptop.program();

	}

	public void setlaptop(Laptop laptop) {
		System.out.println("Invoking setlaptop method in trainer ");
		this.laptop = laptop;
	}
}
