package com.xworkz.Chaining;

public class GroundRunner {

	public static void main(String[] args) {
		System.out.println("invoking mian in GroundRunner");
		Ground ground=new Ground("ChinnaSwamy",35,14,"Bangalore");
		System.out.println(ground.name);
		System.out.println(ground.dimension);
		System.out.println(ground.noOfPlayer);
		System.out.println(ground.location);
		System.out.println("......................................");
		CricketGround CricketGround =new CricketGround();
		System.out.println(CricketGround.name);
		System.out.println(CricketGround.dimension);
		System.out.println(CricketGround.noOfPlayer);
		System.out.println(CricketGround.location);
		System.out.println("......................................");
		CricketGround cricketGround1 =new CricketGround("Kanteerava",45,18,"Kengeri");
		System.out.println(cricketGround1.name);
		System.out.println(cricketGround1.dimension);
		System.out.println(cricketGround1.noOfPlayer);
		System.out.println(cricketGround1.location);

	}

}
