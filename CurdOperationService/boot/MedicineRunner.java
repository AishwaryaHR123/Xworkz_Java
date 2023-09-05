package com.xworkz.CrudOperation.boot;

import com.xworkz.CrudOperation.app.repository.MedicineRepository;
import com.xworkz.CrudOperation.app.repository.MedicineRepositoryImpl;

public class MedicineRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in MedicineRunner");
		MedicineRepository mRepository=new MedicineRepositoryImpl();
		mRepository.cure("Dolo");
		mRepository.cure("cipla");
		mRepository.cure("paracetamol");
		mRepository.cure("cold");
		mRepository.cure("cough");
		mRepository.cure("fever");
		mRepository.cure("conzable");
		mRepository.cure("chest");
		mRepository.cure("Chest&cold");
		mRepository.cure("vicks500");








	}

}
