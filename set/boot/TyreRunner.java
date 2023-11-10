package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;
import com.xworkz.set.app.dto.TyreDTO;

public class TyreRunner {
	public static void main(String[] args) {
		System.out.println("Running main in TyreRunner.....");
		TyreDTO tyre1 = new TyreDTO("Michelin", 4.5f, "Black", 150.00);
		TyreDTO tyre2 = new TyreDTO("Bridgestone", 4.0f, "Silver", 120.50);
		TyreDTO tyre3 = new TyreDTO("Bridgestone", 4.0f, "Silver", 120.50);
		TyreDTO tyre4 = new TyreDTO("Pirelli", 4.2f, "Red", 135.75);
		TyreDTO tyre5 = new TyreDTO("Continental", 4.1f, "Blue", 130.00);
		TyreDTO tyre6 = new TyreDTO("Firestone", 3.5f, "Green", 95.50);
		TyreDTO tyre7 = new TyreDTO("Dunlop", 3.9f, "Yellow", 110.75);
		Collection<TyreDTO> tyreCollection = new HashSet<TyreDTO>();
		tyreCollection.add(tyre1);
		tyreCollection.add(tyre2);
		tyreCollection.add(tyre3);
		tyreCollection.add(tyre4);
		tyreCollection.add(tyre5);
		tyreCollection.add(tyre6);
		tyreCollection.add(tyre7);
		System.out.println("Total Tyres:" + tyreCollection.size());

	}

}
