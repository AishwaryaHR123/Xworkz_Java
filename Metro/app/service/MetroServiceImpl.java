package com.xworkz.crudoperationn.app.service;

import com.xworkz.crudoperationn.app.repository.MetroRepository;
import com.xworkz.crudoperationn.dto.MetroDTO;

public class MetroServiceImpl implements MetroService {
	private MetroRepository metroRepository;

	public MetroServiceImpl(MetroRepository metroRepository) {
		this.metroRepository = metroRepository;
	}

	@Override
	public boolean validateAndSave(MetroDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			String language = dto.getLanguage();
			String fromStation = dto.getFromStation();
			String toStation = dto.getToStation();
			double fare = dto.getFare();
			int noOfPassenger = dto.getNoOfPassenger();
			String email = dto.getEmail();
			String userName = dto.getUserName();
			int rating = dto.getRating();
			String line = dto.getLine();
			int since = dto.getSince();
			if (language != null && !language.isEmpty() && language.length() > 3 && language.length() <= 20) {
				System.out.println("Language is valid");
			} else {
				System.err.println("Langauge is invalid");
				return false;
			}
			if (fromStation != null && !fromStation.isEmpty() && fromStation.length() > 3
					&& fromStation.length() <= 20) {
				System.out.println("fromStation is valid");
			} else {
				System.err.println("fromStation is invalid");
				return false;
			}
			if (toStation != null && !toStation.isEmpty() && toStation.length() > 3 && toStation.length() <= 20) {
				System.out.println("toStation is valid");
			} else {
				System.err.println("toStation is invalid");
				return false;
			}
			if (email != null && !email.isEmpty() && email.length() > 3 && email.length() <= 20) {
				System.out.println("email is valid");
			} else {
				System.err.println("email is invalid");
				return false;
			}
			if (userName != null && !userName.isEmpty() && userName.length() > 3 && userName.length() <= 20) {
				System.out.println("userName is valid");
			} else {
				System.err.println("userName is invalid");
				return false;
			}
			if (line != null && !line.isEmpty() && line.length() > 3 && line.length() <= 20) {
				System.out.println("line is valid");
			} else {
				System.err.println("line is invalid");
				return false;
			}
			if (noOfPassenger > 0 && rating > 0 && since > 2000 && fare > 0) {
				System.out.println("noOfPassenger and rating and since and fare is valid");
			} else {
				System.err.println("noOfPassenger and rating  and since and fare is invalid");
				return false;
			}

			this.metroRepository.save(dto);
			return true;

		}

		return false;
	}

	@Override
	public MetroDTO findByLanguage(String name) {
		System.out.println("Running findByLanguage....");
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
			System.out.println("Language is valid, will find...");
			MetroDTO dto = this.metroRepository.findByLanguage(name);
			return dto;
		} else {
			System.err.println("language is invalid");
		}
		return MetroService.super.findByLanguage(name);
	}

}
