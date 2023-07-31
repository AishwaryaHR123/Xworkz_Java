package com.xworkz.AssocProgram;

public class Company {
	public String companyName;
	public String ceo;
	public String originCountry;
	public Company(String companyName,String ceo,String originCountry)
	{
		this.companyName=companyName;
		this.ceo=ceo;
		this.originCountry=originCountry;
	}
	public void printInfo() {
		System.out.println("invoking printInfo in the company");
		System.out.println("Company name is :"+this.companyName);
		System.out.println("ceo :"+this.ceo);
		System.out.println("originCountry is:"+this.originCountry);

	}

}
