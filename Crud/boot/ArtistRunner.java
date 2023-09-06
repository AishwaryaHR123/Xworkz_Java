package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.ArtistRepository;
import com.xworkz.CrudOperation.app.repository.ArtistRepositoryImpl;

public class ArtistRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ArtistRunner");
		ArtistRepository artistRepository=new ArtistRepositoryImpl();
		artistRepository.entertain("ChandhanShetty");
		artistRepository.entertain("Sudeep");
		artistRepository.entertain("Darshan");
		artistRepository.entertain("Aishwarya");
		artistRepository.entertain("Anusha");
		artistRepository.entertain("Pooja");
		artistRepository.entertain("Rajkumar");
		artistRepository.entertain("Mounika");
		artistRepository.entertain("Shravya");
		artistRepository.entertain("Punith");
	}

}
