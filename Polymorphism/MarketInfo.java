package com.xworkz.Polymorphism;

public class MarketInfo extends Market {
	@Override
	public void sell() {
		System.out.println("MarketInfo overrides Market");
		super.sell();
	}
	@Override
	public void sell(String name) {
		super.sell(name);
	}
	@Override
	public void sell(String name, String location) {
		super.sell(name, location);
	}
	@Override
	public void sell(String name, String location, boolean license) {
		super.sell(name, location, license);
	}
	@Override
	public void sell(String name, String location, boolean license, String type) {
		super.sell(name, location, license, type);
	}
	@Override
	public void sell(String name, String location, boolean license, String type, String paymentMethod) {
		super.sell(name, location, license, type, paymentMethod);
	}

}
