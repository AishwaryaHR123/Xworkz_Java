package com.xworkz.set.boot;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.set.app.dto.PlayGroundDTO;

public class PlayGroundRunner {

	public static void main(String[] args) {
		System.out.println("Running main in PlayGroundRunner..");
		PlayGroundDTO playground1 = new PlayGroundDTO("Kanteerava", "Rubber Mulch", "Bangalore", 8);
		PlayGroundDTO playground2 = new PlayGroundDTO("Chinnaswamy", "Sand", "Hubbali", 6);
		PlayGroundDTO playground3 = new PlayGroundDTO("Chinnaswamy", "Sand", "Hubbali", 6);
		PlayGroundDTO playground4 = new PlayGroundDTO("Adventure Land", "Grass", "Dharwad", 5);
		PlayGroundDTO playground5 = new PlayGroundDTO("KSCA Stadium", "Poured-in-Place Rubber", "Belagavi", 12);
		PlayGroundDTO playground6 = new PlayGroundDTO("KSCA Brijesh Patel", "Wood Chips", "Davanagere", 7);
		PlayGroundDTO playground7 = new PlayGroundDTO("Aditya Global Sports", "Artificial Turf", "Shivamogga", 9);
		
		Collection<PlayGroundDTO> collectionGround=new HashSet<PlayGroundDTO>();
		collectionGround.add(playground1);
		collectionGround.add(playground2);
		collectionGround.add(playground3);
		collectionGround.add(playground4);
		collectionGround.add(playground5);
		collectionGround.add(playground6);
		collectionGround.add(playground7);
		System.out.println("Total PlayGround: "+collectionGround.size());


	}

}
