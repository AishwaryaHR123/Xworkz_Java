package com.xworkz.newspaper.app.repository;

import com.xworkz.newspaper.app.dto.AadharDTO;

public interface AadharRepository {
	int TOTAL_DETAILS=10;
	void save(AadharDTO dto);

}
