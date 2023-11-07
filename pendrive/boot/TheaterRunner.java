package com.xworkz.pendrive.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pendrive.app.dto.TheaterDTO;

public class TheaterRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TheaterRunner");
		TheaterDTO dto=new TheaterDTO("Navarang", 4, "Rajajinagar", "Ghost");
		TheaterDTO dto1=new TheaterDTO("PVR", 3, "Kengeri", "Jawan");
		TheaterDTO dto2=new TheaterDTO("Lakshmi", 2, "Shivamogga", "SSE");
		TheaterDTO dto3=new TheaterDTO("HPC", 5, "Kormangala", "Kantara");
		TheaterDTO dto4=new TheaterDTO("CinePolis", 6, "Malleshwaram", "Sarathi");
		Collection<TheaterDTO> theater=new ArrayList<TheaterDTO>();
		theater.add(dto);
		theater.add(dto1);
		theater.add(dto2);
		theater.add(dto3);
		theater.add(dto4);
		
		theater.stream().sorted().forEach(th->System.out.println(th));


		
	}

}
