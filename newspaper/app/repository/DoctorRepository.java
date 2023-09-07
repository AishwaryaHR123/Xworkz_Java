package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.DoctorDTO;

public interface DoctorRepository {
	int TOTAL_DOCTOR=10;
	void save(DoctorDTO dto);

}
