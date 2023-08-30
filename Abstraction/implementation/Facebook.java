package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.SocialMedia;

public class Facebook implements SocialMedia{

	@Override
	public void connect() {
		System.out.println("invoking connect in facebook");
	}
	

}
