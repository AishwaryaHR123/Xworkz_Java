package com.xworkz.Farmer.app;

public class Mobile {
	private String game;
	private Charger charger;

	public void Mobile(String game) {
		System.out.println("Invoking const  in mobile");
		this.game = game;
	}

	public void setCharger(Charger charger) {
		System.out.println("Invoking set method in mobile");
		this.charger = charger;
	}

	public void music() {
		System.out.println("Invoking music method in mobile");
		this.charger.capacity();
		this.charger.inputPower();
		this.charger.maxVoltage();
		this.charger.USBcabel();
	}

	public void chat() {
		System.out.println("Invoking chat method in mobile");
	}

	public void player() {
		System.out.println("Invoking player method in mobile");
	}

	public void RAM() {
		System.out.println("Invoking player method in mobile");
	}

}
