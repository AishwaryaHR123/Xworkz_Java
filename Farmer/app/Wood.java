package com.xworkz.Farmer.app;

public class Wood {
	private String type;
	private Paper paper;

	public void Wood(String type) {
		System.out.println("Invoking const in Wood");
		this.type=type;
	}

	public void pulp() {
		System.out.println("Invoking pulp method in Wood");
		this.paper.book();

	}

	public void setPaper(Paper paper) {
		System.out.println("Invoking set method in Wood");
		this.paper = paper;
	}
}
