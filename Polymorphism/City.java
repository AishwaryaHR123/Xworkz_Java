package com.xworkz.Polymorphism;

public class City {
	public void living() {
		System.out.println("invoking no-args in social");
	}

	public void living(String cityName) {
		System.out.println("invoking String in living");
	}

	public void living(String cityName, int pincode) {
		System.out.println("invoking String,int in living");
	}

	public void living(String cityName, int pincode, int population) {
		System.out.println("invoking String,int,int in living");
	}

	public void living(String cityName, int pincode, int population, boolean education) {
		System.out.println("invoking String,int,int,boolean in living");
	}

	public void living(String cityName, int pincode, int population, boolean education, int rating) {
		System.out.println("invoking String,int,int,boolean,int in living");
	}

}
