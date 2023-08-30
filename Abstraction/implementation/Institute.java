package com.xworkz.Abstraction.implementation;

import com.xworkz.Abstraction.rule.Education;

public class Institute implements Education{

	@Override
	public void skill() {
		System.out.println("invoking Skill in Institute");
	}

}
