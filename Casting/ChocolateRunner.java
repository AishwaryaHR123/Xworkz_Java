package com.xworkz.Casting;

public class ChocolateRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ChocolateRunner");
		System.out.println("...............................");
		Chocolate chocolate = new Chocolate();
		DarkChocolate darkChocolate = new DarkChocolate();
		CaramelChocolate caramelChocolate = new CaramelChocolate();
		ChocolateUtil.taste(chocolate);
		System.out.println("...............................");
		ChocolateUtil.taste(darkChocolate);
		System.out.println("...............................");
		ChocolateUtil.taste(caramelChocolate);

	}

}
