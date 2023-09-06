package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.GroceryRepository;
import com.xworkz.CrudOperation.app.repository.GroceryRepositoryImpl;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GroceryRunner");
		GroceryRepository groceryRepository = new GroceryRepositoryImpl();
		groceryRepository.save("Rice");
		groceryRepository.save("Wheat");
		groceryRepository.save("Ragi");
		groceryRepository.save("Daal");
		groceryRepository.save("Oil");
		groceryRepository.save("Almond");
		groceryRepository.save("Potato");
		groceryRepository.save("Tomato");
		groceryRepository.save("Onion");
		groceryRepository.save("Chilli");

	}

}
