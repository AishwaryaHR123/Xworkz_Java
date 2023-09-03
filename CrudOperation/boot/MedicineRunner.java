package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.MedicineRepository;
import com.xworkz.CrudOperation.app.repository.MedicineRepositoryImpl;

public class MedicineRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MedicineRunner");
		MedicineRepository mRepository=new MedicineRepositoryImpl();
		mRepository.cure(200);
		mRepository.cure(350);
		mRepository.cure(555);
		mRepository.cure(124);
		mRepository.cure(453);
		mRepository.cure(654);
		mRepository.cure(865);
		mRepository.cure(987);
		mRepository.cure(234);
		mRepository.cure(765);








	}

}
