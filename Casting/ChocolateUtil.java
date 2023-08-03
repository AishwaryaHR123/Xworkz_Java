package com.xworkz.Casting;

public class ChocolateUtil{
	public static void taste(Chocolate chocolate)
	{
		System.out.println("invoking taste in ChocolateUtil ");
		System.out.println(chocolate.name);
		chocolate.chocolateInfo();
		if (chocolate instanceof DarkChocolate)
		{
			System.out.println("Chocolate is DarkChocolate");
			DarkChocolate darkChocolate=(DarkChocolate)chocolate;
			System.out.println(darkChocolate.price);
			darkChocolate.darkInfo();
		}
		if (chocolate instanceof CaramelChocolate)
		{
			System.out.println("Chocolate is CaramelChocolate");
			CaramelChocolate caramelChocolate=(CaramelChocolate)chocolate;
			System.out.println(caramelChocolate.quantity);
			caramelChocolate.ingredient();;
		}
	}

}
