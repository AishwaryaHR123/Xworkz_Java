package com.xworkz.app.implementation;

import com.xworkz.app.Interface.Military;

public class MilitaryCommand implements Military {

	@Override
	public boolean discipline(String country) {
		System.out.println("invoking discipline in Military");
		return true;
	}

	@Override
	public String unifrom(boolean securityGood) {
		System.out.println("invoking uniform in Military");		
		return "parade Dress";
	}

	@Override
	public String service() {
		System.out.println("invoking Service in Military");		
		return "Army";
	}

}
