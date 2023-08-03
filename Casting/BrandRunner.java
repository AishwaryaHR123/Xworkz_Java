package com.xworkz.Casting;

public class BrandRunner {

	public static void main(String[] args) {
		System.out.println("invoking main BrandRunner");
		System.out.println("...............................");
		Brand brand=new Brand();
		LocalBrand localBrand=new LocalBrand();
		NationalBrand nationalBrand=new NationalBrand();
		DuplicateBrand duplicateBrand =new DuplicateBrand();
		InternationalBrand internationalBrand=new InternationalBrand();
		BrandUtil.location(brand);
		System.out.println("...............................");
		BrandUtil.location(localBrand);
		System.out.println("...............................");
		BrandUtil.location(nationalBrand);
		System.out.println("...............................");
		BrandUtil.location(duplicateBrand);
		System.out.println("...............................");
		BrandUtil.location(internationalBrand);


	}

}
