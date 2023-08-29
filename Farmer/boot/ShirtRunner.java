package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Button;
import com.xworkz.Farmer.app.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Shirt Runner");
		String brand = "Passion";
		Button button = new Button();
		Shirt shirt = new Shirt();
		shirt.setButton(button);
		shirt.size();

	}

}
