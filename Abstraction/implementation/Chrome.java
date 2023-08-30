package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Internet;

public class Chrome implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking connect in Chrome");
	}

}
