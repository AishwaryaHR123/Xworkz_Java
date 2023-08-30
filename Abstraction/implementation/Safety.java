package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.PassportVerification;

public class Safety implements PassportVerification {

	@Override
	public void verifyCitizen() {
		System.out.println("invoking verifyCitizen in safety");
	}

}
