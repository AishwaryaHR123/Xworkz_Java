package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Pant;
import com.xworkz.Farmer.app.Zip;

public class PantRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in pant Runner");
		String brand = "qp";
		Zip zip = new Zip();
		Pant pant = new Pant();
		pant.setZip(zip);
		pant.Pant(brand);
		pant.size();
	}
}
