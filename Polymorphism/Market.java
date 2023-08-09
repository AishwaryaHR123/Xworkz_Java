package com.xworkz.Polymorphism;

public class Market {
	public void sell() {
		System.out.println("invoking no-args in Sell");
	}

	public void sell(String name) {
		System.out.println("invoking String in Sell");
	}

	public void sell(String name, String location) {
		System.out.println("invoking String,String in Sell");
	}

	public void sell(String name, String location, boolean license) {
		System.out.println("invoking String,String,boolean in Sell");
	}

	public void sell(String name, String location, boolean license, String type) {
		System.out.println("invoking String,String,boolean,String in Sell");
	}

	public void sell(String name, String location, boolean license, String type, String paymentMethod) {
		System.out.println("invoking String,String,boolean,String,String in Sell");
	}

}
