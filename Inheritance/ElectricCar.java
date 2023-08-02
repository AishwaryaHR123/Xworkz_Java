package com.xworkz.Inheritance;

public class ElectricCar extends Car{
	public int year;
	public ElectricCar()
	{
		System.out.println("invoking no-args in Electric Car");
	}
	public void charge() {
		System.out.println("invoking Charge in Electric Car");
	}

}
