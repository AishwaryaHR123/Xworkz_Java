package com.xworkz.CrudOperation.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {
	private String[] groceries = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(String grocery) {
		System.out.println("invoking save in GroceryRepositoryImpl");
		if (position < TOTAL_ITEMS) {
			this.groceries[position] = grocery;
			System.out.println("Stored " + grocery + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}

	}

}
