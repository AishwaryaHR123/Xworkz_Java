package com.xworkz.Overloading;

public class MethodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Method Runner");
		IronBox ironBox=new IronBox();
		ironBox.heat();
		ironBox.heat("Philips", 500);
		
		System.out.println("-----------------------------------");
		Hotel hotel=new Hotel();
		hotel.food();
		hotel.food("VidharthiBhavan", true);
		
		System.out.println("-----------------------------------");
		Specs specs =new Specs();
		specs.lens();
		specs.lens("Fastrack", true);
		
		System.out.println("-----------------------------------");
		Umbrella umbrella=new Umbrella();
		umbrella.protect();
		umbrella.protect("black",250);
		
		System.out.println("-----------------------------------");
		Stapler stapler=new Stapler();
		stapler.binding();
		stapler.binding("manual",75);
		
		System.out.println("-----------------------------------");
		Ladder ladder=new Ladder();
		ladder.construct();
		ladder.construct("Iron", 25);
		
		System.out.println("-----------------------------------");
		Gadget gadget=new Gadget();
		gadget.connect();
		gadget.connect("Laptop",40);
		
		System.out.println("-----------------------------------");
		Plier plier=new Plier();
		plier.cut();
		plier.cut(10,450.00);
		
		System.out.println("-----------------------------------");
		Mouse mouse=new Mouse();
		mouse.move();
		mouse.move("hp", 500);
		
		System.out.println("-----------------------------------");
		Elevator elevator=new Elevator();
		elevator.carry();
		elevator.carry(20,false);
	}

}
