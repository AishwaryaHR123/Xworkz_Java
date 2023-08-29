package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Laptop;
import com.xworkz.Farmer.app.Trainer;

public class TrainerRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in trainer runner");
		String name = "Omkar";
		Laptop laptop = new Laptop();
		Trainer trainer = new Trainer();
		trainer.setlaptop(laptop);
		trainer.trainee();

	}

}
