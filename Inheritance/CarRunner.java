package com.xworkz.Inheritance;

public class CarRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in CarRunner");
		Car car1=new Car();
		Car car2=new ElectricCar();
		car1.engine();
		System.out.println(car1.model);
		ElectricCar electricCar=new ElectricCar();
		electricCar.charge();
		System.out.println(electricCar.year);

	}

}
;