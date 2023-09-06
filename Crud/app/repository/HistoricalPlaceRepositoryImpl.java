package com.xworkz.CrudOperation.app.repository;

public class HistoricalPlaceRepositoryImpl implements HistoricalPlaceRepository{
	private String[] places=new String[TOTAL_HISTORICAL];
	int position;

	@Override
	public void travel(String name) {
		System.out.println("invoking travel in HistoricalPlaceRepositoryImpl");
		if (position < TOTAL_HISTORICAL) {
			this.places[position] = name;
			System.out.println("Stored " + name + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}

}
