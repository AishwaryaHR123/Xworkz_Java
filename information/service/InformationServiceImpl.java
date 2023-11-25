package com.xworkz.information.service;

import com.xworkz.information.dto.InformationDTO;
import com.xworkz.information.repository.InformationRepository;

public class InformationServiceImpl implements InformationService{
	InformationRepository repository;
	public InformationServiceImpl(InformationRepository repository) {
		this.repository=repository;
	}

	@Override
	public boolean validateAndSave(InformationDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			String slNo = dto.getSlNo();
			String fName = dto.getfName();
			String lName=dto.getlName();
			String mName=dto.getmName();
			String email=dto.getEmail();
			String gender=dto.getGender();
			String contactNo=dto.getContactNo();
			String area=dto.getArea();
			String district=dto.getDistrict();
			String state=dto.getState();
			String pinCode=dto.getPinCode();
			
			if (slNo != null && !slNo.isEmpty() && slNo.length() > 3 && slNo.length() <= 20) {
				System.out.println("slNo is valid");
			} else {
				System.err.println("slNo is invalid");
				return false;
			}
			if (fName != null && !fName.isEmpty() && fName.length() > 3 && fName.length() <= 20) {
				System.out.println("fName is valid");
			} else {
				System.err.println("fName is invalid");
				return false;
			}
			if (lName != null && !lName.isEmpty() && lName.length() > 3 && lName.length() <= 20) {
				System.out.println("lName is valid");
			} else {
				System.err.println("lName is invalid");
				return false;
			}
			if (mName != null && !mName.isEmpty() && mName.length() > 3 && mName.length() <= 20) {
				System.out.println("mName is valid");
			} else {
				System.err.println("mName is invalid");
				return false;
			}
			if (email != null && !email.isEmpty() && email.length() > 3 && email.length() <= 20) {
				System.out.println("email is valid");
			} else {
				System.err.println("email is invalid");
				return false;
			}
			if (gender != null && !gender.isEmpty() && gender.length() > 3 && gender.length() <= 20) {
				System.out.println("gender is valid");
			} else {
				System.err.println("gender is invalid");
				return false;
			}
			if (contactNo != null && !contactNo.isEmpty() && contactNo.length() > 3 && contactNo.length() <= 20) {
				System.out.println("contactNo is valid");
			} else {
				System.err.println("contactNo is invalid");
				return false;
			}
			if (area != null && !area.isEmpty() && area.length() > 3 && area.length() <= 20) {
				System.out.println("area is valid");
			} else {
				System.err.println("area is invalid");
				return false;
			}
			if (district != null && !district.isEmpty() && district.length() > 3 && district.length() <= 20) {
				System.out.println("district is valid");
			} else {
				System.err.println("district is invalid");
				return false;
			}
			if (state != null && !state.isEmpty() && state.length() > 3 && state.length() <= 20) {
				System.out.println("state is valid");
			} else {
				System.err.println("state is invalid");
				return false;
			}
			if (pinCode != null && !pinCode.isEmpty() && pinCode.length() > 3 && pinCode.length() <= 20) {
				System.out.println("pinCode is valid");
			} else {
				System.err.println("pinCode is invalid");
				return false;
			}
			
			this.repository.save(dto);
			return true;
		
	}
		return false;
	}
}
