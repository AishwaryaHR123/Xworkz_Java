package com.xworkz.CrudOperation.app.Service;

import com.xworkz.CrudOperation.app.repository.MedicineRepository;

public class MedicineSeriviceImpl implements MedicineService {
	private MedicineRepository medicineRepository;
	public MedicineSeriviceImpl(MedicineRepository medicineRepository) {
		this.medicineRepository=medicineRepository;
	}

	@Override
	public void validateAndCure(String medicineName) {
		System.out.println("invoking validateAndCure in "+this.getClass().getSimpleName());
		if(medicineName!=null &&!medicineName.isEmpty() && medicineName.length()>=3 &&  medicineName.length()<=20)
		{
			System.out.println("MedicineData is Valid");
			this.medicineRepository.cure(medicineName);
		}
		else {
			System.out.println("MedicineData is invalid");
		}
		
	}

}
