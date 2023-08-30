package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.PassportVerification;

public class Travel implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen in Travel");
	}

}
