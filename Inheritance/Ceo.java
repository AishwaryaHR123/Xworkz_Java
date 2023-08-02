package com.xworkz.Inheritance;

public class Ceo extends Founder{
	public String ceoName;
	public Ceo()
	{
		System.out.println("invoking no-args in Ceo");
	}
	public void ceoInfo()
	{
		System.out.println("invoking ceoInfo in Ceo");
	}

}
