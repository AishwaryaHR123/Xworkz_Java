package com.xworkz.train.boot;

import com.xworkz.train.constants.CitizenType;
import com.xworkz.train.dto.CitizenTypeDTO;

public class CitizenTypeRunner {

	public static void main(String[] args) {
		CitizenTypeDTO type=new CitizenTypeDTO(CitizenType.SINGLE, 12, 100, "Mounika");
		System.out.println(type);
		System.out.println(type.getCitizenType().getLowerAgeLimit());
		System.out.println(type.getCitizenType().getUpperAgeLimit());
		System.out.println(type.getCitizenType().getName());


	}

}
