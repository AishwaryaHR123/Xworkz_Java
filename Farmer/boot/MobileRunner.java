package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Charger;
import com.xworkz.Farmer.app.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Mobile runner");
		String game = "PubG";
		Charger charger = new Charger();
		Mobile mobile = new Mobile();
		mobile.setCharger(charger);
		mobile.Mobile(game);
		mobile.music();
	}

}
