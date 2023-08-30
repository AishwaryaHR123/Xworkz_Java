package com.xworkz.Abstraction.Runner;

import com.xworkz.Abstraction.implementation.College;
import com.xworkz.Abstraction.implementation.University;
import com.xworkz.Abstraction.rule.Education;

public class EducationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in EducationRunner");
		Education education=new College();
		University university=new University();
		university.setEducation(education);
		university.skill();
	}

}
