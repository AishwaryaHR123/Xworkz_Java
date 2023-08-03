package com.xworkz.Casting;

public class BrandUtil {
	public static void location(Brand brand)
	{
		System.out.println("invoking Brand in BrandUtil");
		System.out.println(brand.cost);
		brand.brandInfo();
		if(brand instanceof LocalBrand)
		{
			System.out.println("Brand is LocalBrand");
			LocalBrand localBrand=(LocalBrand)brand;
			System.out.println(localBrand.name);
			localBrand.localInfo();
			
		}
		if(brand instanceof NationalBrand)
		{
			System.out.println("Brand is NationalBrand");
			NationalBrand nationalBrand=(NationalBrand)brand;
			System.out.println(nationalBrand.price);
			nationalBrand.sell();
			
		}
		if(brand instanceof DuplicateBrand)
		{
			System.out.println("Brand is DuplicateBrand");
			DuplicateBrand duplicateBrand=(DuplicateBrand)brand;
			System.out.println(duplicateBrand.since);
			duplicateBrand.duplicateInfo();
			
		}
		if(brand instanceof InternationalBrand)
		{
			System.out.println("Brand is InternationalBrand");
			InternationalBrand internationalBrand=(InternationalBrand)brand;
			System.out.println(internationalBrand.quantity);
			internationalBrand.internationalInfo();
			
		}
	}

}
