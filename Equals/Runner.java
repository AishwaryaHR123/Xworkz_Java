package com.xworkz.Equals;

public class Runner {

	public static void main(String[] args) {
		System.out.println("invoking main in Runner");
		Minister minister1 = new Minister("Narendra Modi", "Mumbai", 60, "Male", "BJP", "BE");
		Minister minister2 = new Minister("Narendra Modi", "Delhi", 65, "Male", "Congress", "Bsc");
		boolean same = minister1.equals(minister2);
		System.out.println(same);
		System.out.println("---------------------------------------------");
		Ceo ceo1 = new Ceo("Apple", 1999, 20, "BE", "TimCook", "Indian");
		Ceo ceo2 = new Ceo("Apple", 1980, 28, "BTech", "TimCook", "American");
		boolean same1 = ceo1.equals(ceo2);
		System.out.println(same1);
		System.out.println("-----------------------------------------------");
		Sniper snipper1 = new Sniper("Tracer", 300, "Insulated Jacket", 60, 300, true);
		Sniper snipper2 = new Sniper("Tracer", 300, "Insulated Jacket", 50, 400, false);
		boolean same2 = snipper1.equals(snipper2);
		System.out.println(same2);
		System.out.println("-----------------------------------------------");
		Mechanic mechanic1 = new Mechanic("Punith", 30, 15, true, "Rajajinagr", "Mechanical");
		Mechanic mechanic2 = new Mechanic("Punith", 30, 10, true, "Rajajinagr", "PUC");
		boolean same3 = mechanic1.equals(mechanic2);
		System.out.println(same3);
		System.out.println("-----------------------------------------------");
		Cook cook1 = new Cook(10, "Aishwarya", 6, 5, true, 21);
		Cook cook2 = new Cook(10, "Aishwarya", 6, 4, true, 21);
		boolean same4 = cook1.equals(cook2);
		System.out.println(same4);
		System.out.println("-----------------------------------------------");
		Kalla kalla1 = new Kalla("reddy", 25, "valuable items", "pickpocketing", "male", "LockPicking");
		Kalla kalla2 = new Kalla("reddy", 25, "valuable items", "pickpocketing", "male", "LockPicking");
		boolean same5 = kalla1.equals(kalla2);
		System.out.println(same5);

	}

}
