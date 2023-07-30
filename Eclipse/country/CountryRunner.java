package com.xworkz.country;

public class CountryRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in CountyRunner");
		Country country=new Country();
		String ref=country.name;
		Code ref1=country.code;
		System.out.println(ref);
		System.out.println(ref1);
		
		System.out.println(".........................");
		President president=country.president;
		String ref2=president.stateFrom;
		System.out.println(ref2);

		System.out.println("............................");
		PrimeMinister primeminister=country.primeminister;
		String ref3=primeminister.qualification;
		System.out.println(ref3);
		
		System.out.println("............................");
		SecurityHead securityHead=primeminister.securityHead;
		int ref4=securityHead.experience;
		String ref5=securityHead.address;
		System.out.println(ref4);
		System.out.println(ref5);
		
		System.out.println("............................");
		PersonalAssistant personalAssistant=primeminister.personalAssistant;
		long ref6=personalAssistant.number;
		JobTitle ref7=personalAssistant.jobTitle;
		System.out.println(ref6);
		System.out.println(ref7);
		
		System.out.println("............................");
		HomeMinister homeMinister=primeminister.homeMinister;
		int ref8=homeMinister.age;
		MinisterName ref9=homeMinister.ministerName;
		System.out.println(ref8);
		System.out.println(ref9);
		
		
		
	}

}
