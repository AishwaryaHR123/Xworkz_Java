package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.JuiceServiceImpl;
import com.xworkz.CrudOperation.app.Service.JuiceService;
import com.xworkz.CrudOperation.app.repository.JuiceRepository;
import com.xworkz.CrudOperation.app.repository.JuiceRepositoryImpl;

public class JuiceServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in JuiceServiceRunner ");
		JuiceRepository juiceRepository = new JuiceRepositoryImpl();
		JuiceService juiceServie = new JuiceServiceImpl(juiceRepository);
		boolean saved = juiceServie.validateAndSave("Apple");
		System.out.println("Saved = " + saved);
		juiceServie.validateAndSave("Apple");
		juiceServie.validateAndSave("orange");

		
	}

}
