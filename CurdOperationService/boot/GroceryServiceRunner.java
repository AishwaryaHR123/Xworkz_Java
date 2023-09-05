package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.Service.GroceryServiceImpl;
import com.xworkz.CrudOperation.app.Service.GroceryService;
import com.xworkz.CrudOperation.app.repository.GroceryRepository;
import com.xworkz.CrudOperation.app.repository.GroceryRepositoryImpl;

public class GroceryServiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in GroceryServiceRunner");
		GroceryRepository groceryRepository=new GroceryRepositoryImpl();
		GroceryService groceryService=new GroceryServiceImpl(groceryRepository);
		groceryService.validateAndSave("Rice");
		

	}

}
