package com.xworkz.object;

public class AllMethodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in AllMethodRunner");
		System.out.println("--------------------Logo--------------------------------");
		Logo logo = new Logo();
		System.out.println(logo);
		Logo logo1 = new Logo("Orange", "Rectangle", "Xworkz", "Italic", 10);
		System.out.println(logo1);
		Logo logo2 = new Logo("Blue", "Round", "Pesitm", "timesNewRoman", 11);
		System.out.println(logo2);

		System.out.println("---------------------Karchief---------------------------");
		Karchief karchief = new Karchief();
		System.out.println(karchief);
		Karchief karchief1 = new Karchief(50, "Blue", "Cotton", true, "square", 10, true);
		System.out.println(karchief1);
		Karchief karchief2 = new Karchief(100, "White", "Cotton", false, "square", 15, true);
		System.out.println(karchief2);

		System.out.println("---------------------Flag---------------------------");
		Flag flag = new Flag();
		System.out.println(flag);
		Flag flag1 = new Flag("Saffron,White,Green", "India", 91);
		System.out.println(flag1);
		Flag flag2 = new Flag("Dark Blue", "America", 71);
		System.out.println(flag2);

		System.out.println("---------------------Cave-----------------------------------");
		Cave cave = new Cave();
		System.out.println(cave);
		Cave cave1 = new Cave("Western-Ghats", "Yana caves", "Sunlight", "arched", "black", 19, "wind sound", true,
				false, "flowStone");
		System.out.println(cave1);
		Cave cave2 = new Cave("Badmi", "Badmi caves", "Natural", "Rectangular", "Brown", 20, "Stream Sound", false,
				true, "Sand Stone");
		System.out.println(cave2);

		System.out.println("---------------------Pendant---------------------------------");
		Pendant pendant = new Pendant();
		System.out.println(pendant);
		Pendant pendant1 = new Pendant("Silver", "Round", 40000, "Polished", "White", "Box Chain", "nature", true, true,
				false, 50, "Rajajinagar");
		System.out.println(pendant1);
		Pendant pendant2 = new Pendant("gold", "square", 50000, "Hammered", "brown", "Rope Chain", "god", true, true,
				true, 100, "Kengeri");
		System.out.println(pendant2);

	}

}
