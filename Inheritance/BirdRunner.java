package com.xworkz.Inheritance;

public class BirdRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in BirdRunner");
		Bird bird1=new Bird();
		Bird bird2=new Chick();
		Bird bird3=new Parrot();
		bird1.birdInfo();
		System.out.println(bird1.name);
		Chick chick1=new Chick();
		Chick chick2=new Parrot();
		chick1.chickInfo();
		System.out.println(chick1.color);
		Parrot parrot=new Parrot();
		parrot.parrotInfo();
		System.out.println(parrot.birdName);
		

	}

}
