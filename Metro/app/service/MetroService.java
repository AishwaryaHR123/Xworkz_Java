package com.xworkz.crudoperationn.app.service;

import com.xworkz.crudoperationn.dto.MetroDTO;

public interface MetroService {
	boolean validateAndSave(MetroDTO dto);

	default MetroDTO findByLanguage(String name) {
		return null;
	}

}
