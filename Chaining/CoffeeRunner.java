package com.xworkz.Chaining;

public class CoffeeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CoffeeRunner");
		Coffee coffee=new Coffee(250,"Sunrise",true,"Water");
		System.out.println(coffee.price);
		System.out.println(coffee.brand);
		System.out.println(coffee.tasty);
		System.out.println(coffee.Ingredient);
		System.out.println("...........................................");
		SpecialCoffee specialCoffee =new SpecialCoffee();
		System.out.println(specialCoffee.price);
		System.out.println(specialCoffee.brand);
		System.out.println(specialCoffee.tasty);
		System.out.println(specialCoffee.Ingredient);
		System.out.println("...........................................");
		SpecialCoffee specialCoffee1 =new SpecialCoffee(135,"Bru",false,"Sugar");
		System.out.println(specialCoffee1.price);
		System.out.println(specialCoffee1.brand);
		System.out.println(specialCoffee1.tasty);
		System.out.println(specialCoffee1.Ingredient);
	}

}
