package com.xworkz.app.implementation;

import com.xworkz.app.Interface.Metro;

public class RajajinagarMetro implements Metro {

	@Override
	public boolean noSmoking() {
		System.out.println("invoking noSmoking in RajajinagarMetro");
		return false;
	}

	@Override
	public int ticket(double cost) {
		System.out.println("invoking cost in RajajinagarMetro");
		return 100;
	}

	@Override
	public String security(boolean secrutiyGood) {
		System.out.println("invoking security in RajajinagarMetro");
		return "Good";
	}

}
