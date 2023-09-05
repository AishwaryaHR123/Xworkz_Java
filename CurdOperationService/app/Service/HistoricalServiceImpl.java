package com.xworkz.CrudOperation.app.Service;

import com.xworkz.CrudOperation.app.repository.HistoricalPlaceRepository;

public class HistoricalServiceImpl implements HistoricalService {
	private HistoricalPlaceRepository historicalPlaceRepository;
	public HistoricalServiceImpl(HistoricalPlaceRepository historicalPlaceRepository) {
		this.historicalPlaceRepository=historicalPlaceRepository;
	}

	@Override
	public boolean validateAndTravel(String name) {
		System.out.println("invoking validateAndTravel in " +this.getClass().getSimpleName());
		if(name!=null &&!name.isEmpty() && name.length()>=3 &&  name.length()<=20)
		{
			System.out.println("TravelData is Valid");
			this.historicalPlaceRepository.travel(name);
		}
		else {
			System.out.println("TravelData is invalid");
		}
		return false;
	}

}
