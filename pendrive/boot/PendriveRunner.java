package com.xworkz.pendrive.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.pendrive.app.dto.PendriveDTO;

public class PendriveRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main PendriveRunner");
		PendriveDTO pendrive=new PendriveDTO("128Gb","HP", true, 1600);
		PendriveDTO pendrive1=new PendriveDTO("16Gb","Scandisk", true, 1000);
		PendriveDTO pendrive2=new PendriveDTO("32Gb","Sony", false, 1700);
		PendriveDTO pendrive3=new PendriveDTO("1TB","Samsung", true, 180);
		PendriveDTO pendrive4=new PendriveDTO("512Gb","KingStone", true, 1750);
		Collection<PendriveDTO> driveCollection=new ArrayList<PendriveDTO>();
		driveCollection.add(pendrive);
		driveCollection.add(pendrive1);
		driveCollection.add(pendrive2);
		driveCollection.add(pendrive3);
		driveCollection.add(pendrive4);
		
		driveCollection.stream().sorted().forEach(pen->System.out.println(pen));
		


	}

}
