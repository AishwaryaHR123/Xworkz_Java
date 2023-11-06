package com.xworkz.hotel.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.hotel.app.dto.HotelDTO;

public class HotelRunner {
	public static void main(String[] args) {
		System.out.println("Running main in HotelRunner");
		HotelDTO dto1=new HotelDTO(1, "Taj", "Aishwarya", "56748934IN", "India");
		HotelDTO dto2=new HotelDTO(2, "Club Mahindra", "Anusha", "67848934IN", "India");
		HotelDTO dto3=new HotelDTO(3, "Sanavi", "Mounika", "90748934IN", "India");
		HotelDTO dto4=new HotelDTO(4, "Anmol", "Pooja", "89748934SR", "Srilanka");
		HotelDTO dto5=new HotelDTO(5, "Donne Biryani", "Punith", "4534934SR", "Srilanka");
		HotelDTO dto6=new HotelDTO(6, "Hyderabadi Biryani", "Mahantesh", "979069345SR", "Srilanka");
		HotelDTO dto7=new HotelDTO(7, "Leela", "Rudresh", "23458934US", "USA");
		HotelDTO dto8=new HotelDTO(8, "A2B", "Sushma", "87685990US", "USA");
		HotelDTO dto9=new HotelDTO(9, "FabHotel", "Shravya", "345678908UK", "UK");
		HotelDTO dto10=new HotelDTO(10, "Trishul", "Chaithra", "23415623UK", "UK");
		Collection<HotelDTO> hotelCollection=new ArrayList<HotelDTO>();
		hotelCollection.add(dto1);
		hotelCollection.add(dto2);
		hotelCollection.add(dto3);
		hotelCollection.add(dto4);
		hotelCollection.add(dto5);
		hotelCollection.add(dto6);
		hotelCollection.add(dto7);
		hotelCollection.add(dto8);
		hotelCollection.add(dto9);
		hotelCollection.add(dto10);
		
		hotelCollection.stream().filter(c->c.getLocation().equals("India")).map(c->c.getName()).forEach(b->System.out.println("India Hotels: "+b));

        System.out.println("------------------------------------");
        hotelCollection.stream().filter(a->a.getLocation().equals("Srilanka")).map(c->c.getName()).forEach(b->System.out.println("Srilanka Hotels: "+b));

        System.out.println("------------------------------------");
        hotelCollection.stream().map(c->c.getOwnerName()).forEach(b->System.out.println("OwnerName: "+b));
        
        System.out.println("------------------------------------");
        hotelCollection.stream().map(c->c.getGstNo()).forEach(b->System.out.println("GstNo: "+b));
        
        System.out.println("------------------------------------");
        hotelCollection.stream().filter(a->a.getLocation().equals("UK")).map(c->c.getId()).forEach(b->System.out.println("UK Id: "+b));
        
        System.out.println("-------------------------------------");
        hotelCollection.stream().filter(a->a.getLocation().equals("USA")).map(c->c.getOwnerName()).forEach(a->System.out.println("USA OwnerName: "+a));
	}


}
