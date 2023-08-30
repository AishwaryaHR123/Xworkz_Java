package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.Custom;
import com.xworkz.Abstraction.implementation.Safety;
import com.xworkz.Abstraction.rule.PassportVerification;

public class PassPortRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PassPortRunner");
		PassportVerification verification=new Safety();
		Custom custom=new Custom();
		custom.setVerification(verification);
		custom.verifyCitizen();
		
	}

}
