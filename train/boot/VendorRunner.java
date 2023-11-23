package com.xworkz.train.boot;

import com.xworkz.train.constants.VendorType;
import com.xworkz.train.dto.VendorTypeDTO;

public class VendorRunner {

	public static void main(String[] args) {
		VendorTypeDTO dto=new VendorTypeDTO(VendorType.FLIPKART, "Punith", "FLP5670",6578 );
		System.out.println(dto);
		System.out.println(dto.getVendorType().getName());
		System.out.println(dto.getVendorType().getGstNo());
		System.out.println(dto.getVendorType().getSerialNo());
	}
}
