package com.xworkz.crudoperationn.app.repository;

import com.xworkz.crudoperationn.dto.MetroDTO;

public interface MetroRepository {
	int TOTAL_ITEMS = 15;

	void save(MetroDTO dto);

	default boolean isExist(MetroDTO dto) {
		return false;
	}

	default MetroDTO findByLanguage(String name) {
		return null;
	}

}
