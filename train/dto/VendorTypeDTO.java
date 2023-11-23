package com.xworkz.train.dto;

import com.xworkz.train.constants.VendorType;

public class VendorTypeDTO {
	private VendorType vendorType;
	private String name;
	private String gstNo;
	private Integer serialNo;
	public VendorTypeDTO(VendorType vendorType, String name, String gstNo, Integer serialNo) {
		super();
		this.vendorType = vendorType;
		this.name = name;
		this.gstNo = gstNo;
		this.serialNo = serialNo;
	}
	public VendorType getVendorType() {
		return vendorType;
	}
	public void setVendorType(VendorType vendorType) {
		this.vendorType = vendorType;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "VendorTypeDTO [vendorType=" + vendorType + ", name=" + name + ", gstNo=" + gstNo + ", serialNo="
				+ serialNo + "]";
	}
	

}
