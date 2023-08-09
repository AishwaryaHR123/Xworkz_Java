package com.xworkz.Polymorphism;

public class Pub {
	public void entertainment() {
		System.out.println("invoking no-args in entertainment");
	}

	public void entertainment(String pubName) {
		System.out.println("invoking String in entertainment");
	}

	public void entertainment(String pubName, String location) {
		System.out.println("invoking String,String in entertainment");
	}

	public void entertainment(String pubName, String location, String drinkVariety) {
		System.out.println("invoking String,String,String in entertainment");
	}

	public void entertainment(String pubName, String location, String drinkVariety, int hours) {
		System.out.println("invoking String,String,String,int in entertainment");
	}

	public void entertainment(String pubName, String location, String drinkVariety, int hours, boolean music) {
		System.out.println("invoking String,String,String,int,boolean in entertainment");
	}

}
