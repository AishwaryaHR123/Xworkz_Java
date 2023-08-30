package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Education;

public class College implements Education{

	@Override
	public void skill() {
		System.out.println("invoking skill in College");
	}

}
