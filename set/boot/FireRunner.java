package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.FireDTO;

public class FireRunner {

	public static void main(String[] args) {
		System.out.println("Running main FireRunner....");
		FireDTO fire1 = new FireDTO("Wood", "Orange", 800.0f, "Water");
		FireDTO fire2 = new FireDTO("Gasoline", "Blue", 1200.0f, "Foam");
		FireDTO fire3 = new FireDTO("Electrical", "White", 1000.0f, "CO2");
		FireDTO fire4 = new FireDTO("Paper", "Yellow", 700.0f, "Dry Chemical");
		FireDTO fire5 = new FireDTO("Plastic", "Green", 850.0f, "Halon");
		FireDTO fire6 = new FireDTO("Plastic", "Green", 850.0f, "Halon");
		FireDTO fire7 = new FireDTO("Natural Gas", "Red", 1100.0f, "Powder");
		Collection<FireDTO> fireCollection=new HashSet<FireDTO>();
		fireCollection.add(fire1);
		fireCollection.add(fire2);
		fireCollection.add(fire3);
		fireCollection.add(fire4);
		fireCollection.add(fire5);
		fireCollection.add(fire6);
		fireCollection.add(fire7);
		
		System.out.println("Total Fires: "+fireCollection.size());


	}

}
