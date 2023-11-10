package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
		System.out.println("Running main in CrackerRunner..");
		CrackerDTO cracker1 = new CrackerDTO("Aerial Fireworks", "Barium Chloride", "China", 85);
		CrackerDTO cracker2 = new CrackerDTO("Ground Fireworks", "Copper Compound", "USA", 75);
		CrackerDTO cracker3 = new CrackerDTO("Sparklers", "Iron Powder", "India", 60);
		CrackerDTO cracker4 = new CrackerDTO("Roman Candles", "Calcium Salts", "Italy", 90);
		CrackerDTO cracker5 = new CrackerDTO("Fountains", "Magnesium", "Spain", 70);
		CrackerDTO cracker6 = new CrackerDTO("Smoke Bombs", "Lactose", "Germany", 50);
		CrackerDTO cracker7 = new CrackerDTO("Fountains", "Magnesium", "Spain", 70);
		Collection<CrackerDTO> crackCollection=new HashSet<CrackerDTO>();
		crackCollection.add(cracker1);
		crackCollection.add(cracker2);
		crackCollection.add(cracker3);
		crackCollection.add(cracker4);
		crackCollection.add(cracker5);
		crackCollection.add(cracker6);
		crackCollection.add(cracker7);
		System.out.println("Total Crackers: "+crackCollection.size());

		

	}

}
