package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.repository.AadharRepository;

public class AadharServiceImpl implements AadharService {
	private AadharRepository aadharRepository;
	public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository=aadharRepository;
	}

	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("invoking validateAndSave in "+this.getClass().getSimpleName());
		if(dto!=null)
		{
			System.out.println("dto is not null");
			int aadharNo=dto.getAadharNo();
			String name=dto.getName();
			String gender=dto.getGender();
			long mobileNumber=dto.getMobileNumber();
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("name is valid");
			} else {
				System.err.println("name is invalid");
				return false;
			}
			if (gender != null && !gender.isEmpty() && gender.length() >= 3 && gender.length() <= 20) {
				System.out.println("gender is valid");
			} else {
				System.err.println("gender is invalid");
				return false;
			}
			if (aadharNo > 0 && mobileNumber > 0) {
				System.out.println("aadharNo and mobileNumber is valid");
			} else {
				System.err.println("aadharNo and mobileNumber is invalid");
				return false;
			}

			this.aadharRepository.save(dto);
			return true;
		}
		
		return false;
	}

}
