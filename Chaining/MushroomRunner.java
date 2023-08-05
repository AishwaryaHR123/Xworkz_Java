package com.xworkz.Chaining;

public class MushroomRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MushroomRunner");
		Mushroom mushroom = new Mushroom("Brown", 35, 550, true);
		System.out.println(mushroom.color);
		System.out.println(mushroom.quantity);
		System.out.println(mushroom.price);
		System.out.println(mushroom.edible);
		System.out.println("...............................");
		PoisonMushroom poisonMushroom = new PoisonMushroom();
		System.out.println(poisonMushroom.color);
		System.out.println(poisonMushroom.quantity);
		System.out.println(poisonMushroom.price);
		System.out.println(poisonMushroom.edible);
		System.out.println("...............................");
		PoisonMushroom poisonMushroom1 = new PoisonMushroom("Black", 50, 160, false);
		System.out.println(poisonMushroom1.color);
		System.out.println(poisonMushroom1.quantity);
		System.out.println(poisonMushroom1.price);
		System.out.println(poisonMushroom1.edible);

	}

}
