package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.DoctorDTO;
import com.xworkz.newspaper.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {
	private DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public boolean validateAndSave(DoctorDTO dto) {
		System.out.println("invoking validateAndSave in " + this.getClass().getSimpleName());
		if (dto != null) {
			System.out.println("dto is not null");
			String doctorName = dto.getDoctorName();
			int age = dto.getAge();
			String location = dto.getLocation();
			int experience = dto.getExperience();
			if (doctorName != null && !doctorName.isEmpty() && doctorName.length() >= 3 && doctorName.length() <= 20) {
				System.out.println("doctorName is valid");
			} else {
				System.err.println("doctorName is invalid");
				return false;
			}
			if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 20) {
				System.out.println("location is valid");
			} else {
				System.err.println("location is invalid");
				return false;
			}
			if (age > 0 && experience > 0) {
				System.out.println("age and experience is valid");
			} else {
				System.err.println("age and experience is invalid");
				return false;
			}
			this.doctorRepository.save(dto);
			return true;
		}
		return false;
	}

}
