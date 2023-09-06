package com.xworkz.CrudOperation.app.repository;

public class ArtistRepositoryImpl implements ArtistRepository{
	private String[] artists=new String[TOTAL_NAMES];
	int position;

	@Override
	public void entertain(String name) {
		System.out.println("invoking entertain in ArtistRepositoryImpl");
		if (position < TOTAL_NAMES) {
			this.artists[position] = name;
			System.out.println("Stored " + name + " in Position " + this.position);
			this.position++;
		} else {
			System.err.println("index is full not able to store.....");
		}
		
	}

}
