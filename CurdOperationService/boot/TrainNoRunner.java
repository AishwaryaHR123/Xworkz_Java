package com.xworkz.CurdOperationService.boot;

import com.xworkz.CurdOperationService.app.Repository.TrainNoRepository;
import com.xworkz.CurdOperationService.app.Repository.TrainNoRepositoryImpl;
import com.xworkz.CurdOperationService.app.Service.TrainNoService;
import com.xworkz.CurdOperationService.app.Service.TrainNoServiceImpl;

public class TrainNoRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TrainNoRunner");
		TrainNoRepository trainNoRepository=new TrainNoRepositoryImpl();
		TrainNoService trainNoService=new TrainNoServiceImpl(trainNoRepository);
		boolean saved=trainNoService.validateAndSave(3455);
		System.out.println("Saved = "+saved);
		trainNoService.validateAndSave(3455);
		trainNoService.validateAndSave(2345);
	}

}
