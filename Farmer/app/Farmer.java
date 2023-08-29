package com.xworkz.Farmer.app;

public class Farmer {
	private String name;
	private Land land;

	public Farmer(String name) {
		this.name = name;
	}

	public void setLand(Land land) {
		System.out.println("invoking setLand in Farmer");
		this.land = land;
	}

	public void farming() {
		System.out.println("invoking farming in Farmer");
		this.land.cropGrowth();
	}

}
