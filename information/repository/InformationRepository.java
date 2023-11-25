package com.xworkz.information.repository;

import com.xworkz.information.dto.InformationDTO;

public interface InformationRepository {
	int TOTAL_ITEMS=10;
	void save(InformationDTO dto);

}
