package com.xworkz.pendrive.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pendrive.app.dto.TowerDTO;

public class TowerRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TowerRunner...");
		TowerDTO dto=new TowerDTO(3.4f, true, "Communication", "navigation");
		TowerDTO dto1=new TowerDTO(5.7f, true, "Cell towers", "aircraft");
		TowerDTO dto2=new TowerDTO(6.8f, false, "Observation", "decoration");
		TowerDTO dto3=new TowerDTO(4.5f, true, "Commercial", "illumination");
		TowerDTO dto4=new TowerDTO(7.8f, false, "Historical", "elevators");
		
		Collection<TowerDTO> tower=new ArrayList<TowerDTO>();
		tower.add(dto);
		tower.add(dto1);
		tower.add(dto2);
		tower.add(dto3);
		tower.add(dto4);
		
		tower.stream().sorted().forEach(tow->System.out.println(tow));



	}

}
