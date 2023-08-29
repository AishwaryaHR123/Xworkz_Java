package com.xworkz.Farmer.boot;

import com.xworkz.Farmer.app.Laptops;
import com.xworkz.Farmer.app.Processor;

public class LaptopsRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Laptops runner");
		String music="Clasic music";
		Processor Processor=new Processor();
		Laptops laptops=new Laptops();
		laptops.setProcessor(Processor);
		laptops.palyingGames();
	}

}
