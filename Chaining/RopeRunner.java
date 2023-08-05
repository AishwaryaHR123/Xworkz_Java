package com.xworkz.Chaining;

public class RopeRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in RopeRunner");
		Rope rope=new Rope(60,"Blue",15,"Coconut");
		System.out.println(rope.price);
		System.out.println(rope.color);
		System.out.println(rope.length);
		System.out.println(rope.material);
		System.out.println("...............................");
		ClimbingRope climbingRope = new ClimbingRope();
		System.out.println(climbingRope.price);
		System.out.println(climbingRope.color);
		System.out.println(climbingRope.length);
		System.out.println(climbingRope.material);
		System.out.println("...............................");
		ClimbingRope climbingRope1= new ClimbingRope(45,"Black",10,"Plastic");
		System.out.println(climbingRope1.price);
		System.out.println(climbingRope1.color);
		System.out.println(climbingRope1.length);
		System.out.println(climbingRope1.material);

	}

}
