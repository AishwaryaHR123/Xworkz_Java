package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.WireDTO;

public class WireRunner {

	public static void main(String[] args) {
		System.out.println("Running main in WireRunner");
		WireDTO dto1=new WireDTO("Copper", 1.5f, 100, "Electrical Wiring");
		WireDTO dto2=new WireDTO("Copper", 3.5f, 100, "Electrical Wiring");
		WireDTO dto3=new WireDTO("Fiber Cable", 2.5f, 350, "Internet");
		WireDTO dto4=new WireDTO("Glass fibers", 6.5f, 350, "telecommunication");
		WireDTO dto5=new WireDTO("Steel Wire", 3.8f, 150, "Lifting");
		WireDTO dto6=new WireDTO("clad aluminum", 1.5f, 150, "cable internet ");
		WireDTO dto7=new WireDTO("Coaxial Cable", 5.5f, 200, "Television");
		
		Collection<WireDTO> wireCollection=new HashSet<WireDTO>();
		wireCollection.add(dto1);
		wireCollection.add(dto2);
		wireCollection.add(dto3);
		wireCollection.add(dto4);
		wireCollection.add(dto5);
		wireCollection.add(dto6);
		wireCollection.add(dto7);
		
		System.out.println("Total Wires :"+wireCollection.size());

	}

}
