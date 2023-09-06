package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.ArtistService;
import com.xworkz.CrudOperation.app.Service.ArtistServiceImpl;
import com.xworkz.CrudOperation.app.repository.ArtistRepository;
import com.xworkz.CrudOperation.app.repository.ArtistRepositoryImpl;

public class ArtistServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main ArtistServiceRunner");
		ArtistRepository artistRepository=new ArtistRepositoryImpl();
		ArtistService artistService=new ArtistServiceImpl(artistRepository);
		artistService.validateAndEntertain("Chandhan");

	}

}
