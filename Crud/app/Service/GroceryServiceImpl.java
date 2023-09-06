package com.xworkz.CrudOperation.app.Service;

import com.xworkz.CrudOperation.app.repository.GroceryRepository;

public class GroceryServiceImpl implements GroceryService{
	private GroceryRepository groceryRepository;
	public GroceryServiceImpl(GroceryRepository groceryRepository) {
		this.groceryRepository=groceryRepository;
	}

	@Override
	public boolean validateAndSave(String grocery) {
		System.out.println("invoking validateAndSave in "+this.getClass().getSimpleName());
		if(grocery!=null &&!grocery.isEmpty() && grocery.length()>=3 &&  grocery.length()<=20)
		{
			System.out.println("GroceryData is Valid");
			this.groceryRepository.save(grocery);
		}
		else {
			System.out.println("GroceryData is invalid");
		}
		return false;
		
		
	}

}
