package com.xworkz.CrudOperation.app.repository;

public class PoliticianRepositoryImpl implements PoliticianRepository {
	private String[] politicians=new String[TOTAL_POLITICIANS];
	int position;

	@Override
	public void rule(String name) {
		System.out.println("invoking rule in PoliticianRepositoryImpl ");
		if (position < TOTAL_POLITICIANS) {
			this.politicians[position] = name;
			System.out.println("Stored " + name + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
	}

}
