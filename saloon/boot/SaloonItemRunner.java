package com.xworkz.saloon.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.saloon.app.dto.SaloonItemDTO;

public class SaloonItemRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in SaloonItemRunner");
		SaloonItemDTO dto1=new SaloonItemDTO(1, "Scissor", 100, "Cutting", true);
		SaloonItemDTO dto2=new SaloonItemDTO(2, "Shampoo", 300, "HairWash", false);
		SaloonItemDTO dto3=new SaloonItemDTO(3, "Hair Color", 500, "coloring", true);
		SaloonItemDTO dto4=new SaloonItemDTO(4, "Razor", 150, "Shaving", true);
		SaloonItemDTO dto5=new SaloonItemDTO(5, "Facial Masks", 850, "Facial", false);
		SaloonItemDTO dto6=new SaloonItemDTO(6, "Nail Drill", 600, "filing Nails", false);
		SaloonItemDTO dto7=new SaloonItemDTO(7, "Massage Tables", 900, "massage", true);
		SaloonItemDTO dto8=new SaloonItemDTO(8, "Hair Rollers", 1000, "Hair Curl", false);
		SaloonItemDTO dto9=new SaloonItemDTO(9, "Combs", 400, "styling hair", true);
		SaloonItemDTO dto10=new SaloonItemDTO(10, "Steamers", 1500, "facial Treament", false);
		Collection<SaloonItemDTO> saloon=new ArrayList();
		saloon.add(dto1);
		saloon.add(dto2);
		saloon.add(dto3);
		saloon.add(dto4);
		saloon.add(dto5);
		saloon.add(dto6);
		saloon.add(dto7);
		saloon.add(dto8);
		saloon.add(dto9);
		saloon.add(dto10);
		System.out.println("Saloon Items:" +saloon.size());
		
		Iterator<SaloonItemDTO> itr=saloon.iterator();
		int count=0;
		for(SaloonItemDTO saloonItem:saloon)
		{
			if(saloonItem.getName().contains("S"))
			{
				System.out.println("SaloonItemName : "+saloonItem.getName());
				count++;
			}
		}
	   System.out.println("Count is :"+count);
	   Collection<SaloonItemDTO> containCollection=new ArrayList();
	   SaloonItemDTO dto11=new SaloonItemDTO(4, "Razor", 150, "Shaving", true);
	   SaloonItemDTO dto12=new SaloonItemDTO(5, "Facial Masks", 850, "Facial", false);
	   containCollection.add(dto11);
	   containCollection.add(dto12);
	   
	   boolean ref1=saloon.containsAll(containCollection);
	   System.out.println("ContainsAll : " +ref1);
	   
	   boolean ref2=saloon.remove(dto12);
	   System.out.println("Remove: "+ref2);
	   System.out.println("Remove size is "+saloon.size());

	   
	   Collection<SaloonItemDTO> removeCollection=new ArrayList();
	   SaloonItemDTO dto13=new SaloonItemDTO(4, "Razor", 150, "Shaving", true);
	   SaloonItemDTO dto14=new SaloonItemDTO(5, "Facial Masks", 850, "Facial", false);
	   removeCollection.add(dto13);
	   removeCollection.add(dto14);
	   boolean ref3=saloon.removeAll(removeCollection);
	   System.out.println("RemoveAll :"+ref3);
	   System.out.println("Remove all size is "+saloon.size());
	   
	   
			
	}
		
}
