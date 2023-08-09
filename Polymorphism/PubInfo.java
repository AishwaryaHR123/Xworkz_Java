package com.xworkz.Polymorphism;

public class PubInfo extends Pub {
	@Override
	public void entertainment() {
		System.out.println("PubInfo overrides Pub");
		super.entertainment();
	}

	@Override
	public void entertainment(String pubName) {
		super.entertainment(pubName);
	}

	@Override
	public void entertainment(String pubName, String location) {
		super.entertainment(pubName, location);
	}

	@Override
	public void entertainment(String pubName, String location, String drinkVariety) {
		super.entertainment(pubName, location, drinkVariety);
	}

	@Override
	public void entertainment(String pubName, String location, String drinkVariety, int hours) {
		super.entertainment(pubName, location, drinkVariety, hours);
	}

	@Override
	public void entertainment(String pubName, String location, String drinkVariety, int hours, boolean music) {
		super.entertainment(pubName, location, drinkVariety, hours, music);
	}

}
