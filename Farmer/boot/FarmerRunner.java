package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Farmer;
import com.xworkz.Farmer.app.Land;

public class FarmerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in FarmerRunner");
		String name = "Aishwarya";
		Land land = new Land();
		Farmer farmer = new Farmer(name);
		farmer.setLand(land);
		farmer.farming();
	}

}
