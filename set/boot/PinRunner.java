package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.PinDTO;

public class PinRunner {

	public static void main(String[] args) {
		System.out.println("Running main in PinRunner");
		PinDTO pin1 = new PinDTO("Metal", 1.5, "Sharp", "Office");
        PinDTO pin2 = new PinDTO("Plastic", 0.8, "Blunt", "Craft");
        PinDTO pin3 = new PinDTO("Wood", 2.0, "Sharp", "Home");
        PinDTO pin4 = new PinDTO("Aluminum", 1.2, "Sharp", "Office");
        PinDTO pin5 = new PinDTO("Stainless Steel", 2.5, "Sharp", "Industrial");
        PinDTO pin6 = new PinDTO("Plastic", 0.6, "Blunt", "Craft");
        PinDTO pin7 = new PinDTO("Metal", 1.5, "Sharp", "Office");
        Collection<PinDTO> pinCollection=new HashSet<PinDTO>();
        pinCollection.add(pin1);
        pinCollection.add(pin2);
        pinCollection.add(pin3);
        pinCollection.add(pin4);
        pinCollection.add(pin5);
        pinCollection.add(pin6);
        pinCollection.add(pin7);
        System.out.println("Total Pins: "+pinCollection.size());


	}

}
