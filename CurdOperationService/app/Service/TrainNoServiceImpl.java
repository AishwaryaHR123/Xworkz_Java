package com.xworkz.CurdOperationService.app.Service;

import com.xworkz.CurdOperationService.app.Repository.TrainNoRepository;

public class TrainNoServiceImpl implements TrainNoService {
	private TrainNoRepository trainNoRepository;
	public TrainNoServiceImpl(TrainNoRepository trainNoRepository) {
		this.trainNoRepository=trainNoRepository;
	}

	@Override
	public boolean validateAndSave(int trainNumber) {
		System.out.println("invoking ValidateAndSave " + this.getClass().getSimpleName());
		if (trainNumber!=0) {
			System.out.println("TrainNo is valid,stored in repo");
			if (!this.trainNoRepository.isExist(trainNumber)) {
				this.trainNoRepository.TrainNoAndSave(trainNumber);
				return true;
			} else {
				System.err.println("Train Number " + trainNumber + " already exists,add another one");
			}
		} else {
			System.err.println("Train Number " + trainNumber + " is invalid");
		}
		return false;
	}

}
