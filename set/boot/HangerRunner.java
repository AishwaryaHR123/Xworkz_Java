package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.HangerDTO;

public class HangerRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HangerRunner");
		HangerDTO hanger1 = new HangerDTO("Wood", 30, 5, "Brown");
        HangerDTO hanger2 = new HangerDTO("Plastic", 25, 3, "White");
        HangerDTO hanger3 = new HangerDTO("Metal", 40, 8, "Silver");
        HangerDTO hanger4 = new HangerDTO("Wood", 35, 6, "Black");
        HangerDTO hanger5 = new HangerDTO("Steel", 20, 2, "Chrome");
        HangerDTO hanger6 = new HangerDTO("Aluminum", 45, 10, "Gold");
        HangerDTO hanger7 = new HangerDTO("Wood", 30, 5, "Brown");
        Collection<HangerDTO> hangCollection=new HashSet<HangerDTO>();
        hangCollection.add(hanger1);
        hangCollection.add(hanger2);
        hangCollection.add(hanger3);
        hangCollection.add(hanger4);
        hangCollection.add(hanger5);
        hangCollection.add(hanger6);
        hangCollection.add(hanger7);
        System.out.println("Total Hanger :"+hangCollection.size());

	}

}
