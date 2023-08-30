package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Internet;

public class Edge implements Internet {

	@Override
	public void connect() {
		System.out.println("invoking Edge in Internet");
	}

}
