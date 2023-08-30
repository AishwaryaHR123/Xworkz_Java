package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Internet;

public class Browser {
	private Internet internet;

	public void connect() {
		System.out.println("invoking connect in Browser");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		System.out.println("invoking setInternet in Browser");
		this.internet = internet;
	}

}
