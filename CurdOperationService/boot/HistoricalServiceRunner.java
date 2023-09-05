package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.HistoricalService;
import com.xworkz.CrudOperation.app.Service.HistoricalServiceImpl;
import com.xworkz.CrudOperation.app.repository.HistoricalPlaceRepository;
import com.xworkz.CrudOperation.app.repository.HistoricalPlaceRepositoryImpl;

public class HistoricalServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main HistoricalServiceRunner");
		HistoricalPlaceRepository historicalPlaceRepository=new HistoricalPlaceRepositoryImpl();
		HistoricalService historicalService=new HistoricalServiceImpl(historicalPlaceRepository);
		historicalService.validateAndTravel("TajMahal");

	}

}
