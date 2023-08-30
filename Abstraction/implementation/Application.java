package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Software;

public class Application implements Software{

	@Override
	public void program() {
		System.out.println("invoking program in Application");
	}

}
