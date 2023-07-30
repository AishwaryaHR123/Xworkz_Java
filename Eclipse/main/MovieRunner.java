package com.xworkz.main;

import com.xworkz.movie.Auditor;
import com.xworkz.movie.Budget;
import com.xworkz.movie.Company;
import com.xworkz.movie.CompanyName;
import com.xworkz.movie.Language;
import com.xworkz.movie.Movie;
import com.xworkz.movie.Producer;

public class MovieRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in MovieRunner");
		Movie movie=new Movie();
		String ref=movie.name;
		Language ref1=movie.language;
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println("........................");
		Producer producer=movie.producer;
		long ref2=producer.mobileNo;
		Budget ref3=producer.budget;
		System.out.println(ref2);
		System.out.println(ref3);
		System.out.println("........................");
		Auditor auditor=producer.auditor;
		int ref4=auditor.aadharNo;
		System.out.println(ref4);
		System.out.println("........................");
		Company company =auditor.company;
		String ref5=company.location;
		CompanyName ref6=company.companyName;
		System.out.println(ref5);
		System.out.println(ref6);
		
		
		
	}

}
