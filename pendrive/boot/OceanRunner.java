package com.xworkz.pendrive.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pendrive.app.dto.OceanDTO;

public class OceanRunner {

	public static void main(String[] args) {
		System.out.println("Running main in OceanRunner");
		OceanDTO dto=new OceanDTO("Pacific", true, 4.6f, "Plastic");
		OceanDTO dto1=new OceanDTO("Atlantic", true, 3.5f, "metals");
		OceanDTO dto2=new OceanDTO("Indian", false, 2.4f, "Oil");
		OceanDTO dto3=new OceanDTO("Antarctic", true,6.7f, "Sewage");
		OceanDTO dto4=new OceanDTO("Arctic", false, 5.3f, "Thermal");
		Collection<OceanDTO> ocean=new ArrayList<OceanDTO>();
		ocean.add(dto);
		ocean.add(dto1);
		ocean.add(dto2);
		ocean.add(dto3);
		ocean.add(dto4);
		ocean.stream().sorted().forEach(ocea->System.out.println(ocea));


	}

}
