package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.HistoricalPlaceRepository;
import com.xworkz.CrudOperation.app.repository.HistoricalPlaceRepositoryImpl;

public class HistoricalRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in HistoricalRunner");
		HistoricalPlaceRepository hRepository=new HistoricalPlaceRepositoryImpl();
		hRepository.travel("TajMahal");
		hRepository.travel("Gol GumBaz");
		hRepository.travel("Jog Falls");
		hRepository.travel("Nandhi Hills");
		hRepository.travel("Horanadu");
		hRepository.travel("Isha");
		hRepository.travel("Mysore Palace");
		hRepository.travel("Sringeri");
		hRepository.travel("Halebidu");
		hRepository.travel("Horenadu");
	}

}
