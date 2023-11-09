package com.xworkz.products.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.products.app.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
		System.out.println("Running main in ProductRunner");
		ProductDTO dto1=new ProductDTO(1, 20, 3452670, 10, "Laptop", "Laptop is Good", "Amazon", "Watch Tech", "bag", "hand Bag", "ASIN123", "USA", "free", 4.5f, 1000, 300, 250, 200, 150, 50, 49.99, 10.0,2.5, 1, false, false, LocalDate.of(2023, 1, 15), LocalDate.of(2024, 1, 15),  LocalDate.of(2023, 11, 1), LocalDate.of(2023, 11, 10), LocalDate.of(2023, 12, 20));
		ProductDTO dto2 = new ProductDTO(2, 15, 123456, 25, "Laptop", "High-performance laptop", "Dell", "Tech Corp", "Laptop bag", "Laptop model ABC", "ASIN456", "China", "premium", 4.8f, 1500, 500, 450, 350, 200, 100, 899.99, 50.0, 3.0, 2, false, true, LocalDate.of(2023, 2, 20), LocalDate.of(2024, 4, 21), LocalDate.of(2023, 10, 5), LocalDate.of(2023, 12, 15), LocalDate.of(2023, 10, 25));
		ProductDTO dto3 = new ProductDTO(3, 5, 789012, 15, "Headphones", "High-quality headphones", "Sony", "Audio Gear ", "Headphone case", "Head12YZ", "ASIN789", "Japan", "standard", 4.2f, 800, 200, 150, 150, 100, 50, 129.99, 20.0, 0.5, 1, true, true, LocalDate.of(2023, 3, 10), LocalDate.of(2024, 6, 11), LocalDate.of(2023, 12, 10), LocalDate.of(2023, 11, 20), LocalDate.of(2023, 11, 1));
		ProductDTO dto4 = new ProductDTO(4, 30, 987654, 35, "Smartphone", "Latest smartphone model", "Samsung", "Mobile Tech", "Phone case", "Smart13", "ASIN987", "South Korea", "express", 4.6f, 1200, 350, 300, 250, 150, 80, 699.99, 30.0, 0.7, 2, false, true, LocalDate.of(2023, 4, 5), LocalDate.of(2024, 4, 25), LocalDate.of(2023, 11, 15), LocalDate.of(2023, 10, 25), LocalDate.of(2023, 12, 5));
		ProductDTO dto5 = new ProductDTO(5, 25, 543210, 45, "Camera", "Professional DSLR camera", "Canon", "Photography Inc", "Camera bag", "Cam23", "ASIN543", "Japan", "express", 4.9f, 900, 250, 200, 200, 150, 80, 1499.99, 60.0, 1.5, 3, false, true, LocalDate.of(2023, 5, 15), LocalDate.of(2024, 5, 15), LocalDate.of(2023, 11, 20), LocalDate.of(2023, 11, 30), LocalDate.of(2023, 10, 10));
		ProductDTO dto6 = new ProductDTO(6, 40, 135792, 53, "Tablet", "Sleek and compact tablet", "Apple", "Tech Innovations", "Tablet case", "iPad Mini", "ASIN135", "USA", "prime", 4.7f, 1100, 300, 250, 220, 180, 80, 399.99, 15.0, 0.8, 1, false, true, LocalDate.of(2023, 6, 20), LocalDate.of(2024, 6, 20), LocalDate.of(2023, 12, 25), LocalDate.of(2023, 12, 5), LocalDate.of(2023, 11, 15));
		ProductDTO dto7 = new ProductDTO(7, 10, 246813, 72, "Book", "Bestselling novel", "Penguin Books", "Bookstore Inc", "N/A", "The Great Novel", "ASIN246", "USA", "free", 4.0f, 500, 100, 120, 80, 60, 40, 14.99, 2.0, 0.5, 0, false, true, LocalDate.of(2023, 7, 1), LocalDate.of(2024, 7, 1), LocalDate.of(2023, 11, 1), LocalDate.of(2023, 10, 10), LocalDate.of(2023, 9, 20));
		ProductDTO dto8 = new ProductDTO(8, 50, 112233, 91, "Shoes", "Sports shoes for athletes", "Nike", "Sports Gear Co", "Shoebox", "Athletic Pro", "ASIN112", "Vietnam", "standard", 4.4f, 700, 200, 180, 160, 120, 80, 79.99, 10.0, 0.9, 0, false, true, LocalDate.of(2023, 8, 10), LocalDate.of(2024, 8, 10), LocalDate.of(2023, 12, 5), LocalDate.of(2023, 12, 15), LocalDate.of(2023, 12, 25));
		ProductDTO dto9 = new ProductDTO(9, 15, 998877, 78, "Blender", "High-speed blender for smoothies", "Vitamix", "Kitchen Appliances", "Blender set", "Blender Pro", "ASIN998", "USA", "prime", 4.8f, 600, 200, 150, 150, 100, 70, 199.99, 20.0, 3.0, 1, false, true, LocalDate.of(2023, 9, 15), LocalDate.of(2024, 9, 15), LocalDate.of(2023, 11, 15), LocalDate.of(2023, 11, 25), LocalDate.of(2023, 10, 5));
		ProductDTO dto10 = new ProductDTO(10, 30, 456789, 101, "T-shirt", "Comfortable cotton T-shirt", "Adidas", "Apparel Co", "N/A", "Sporty Tee", "ASIN456", "Vietnam", "free", 4.5f, 900, 300, 250, 250, 150, 80, 29.99, 5.0, 0.3, 0, false, true, LocalDate.of(2023, 10, 5), LocalDate.of(2024, 10, 5), LocalDate.of(2023, 12, 10), LocalDate.of(2023, 11, 20), LocalDate.of(2023, 11, 30));
		
		Collection<ProductDTO> collection=new ArrayList<ProductDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		
		Comparator<ProductDTO> product=(t1,t2)->Integer.compare(t1.getId(), t2.getId());
		collection.stream().sorted(product).forEach(a->System.out.println(a));
		
		System.out.println("------------------------Id Desc-----------------------------------------------");
		Comparator<ProductDTO> product1=(t1,t2)->Integer.compare(t2.getId(), t1.getId());
		collection.stream().sorted(product1).forEach(a->System.out.println(a));

		System.out.println("-----------------------------Quantity Asc-------------------------------------");
		Comparator<ProductDTO> product2=(t1,t2)->Integer.compare(t1.getQuantity(), t2.getQuantity());
		collection.stream().sorted(product2).forEach(b->System.out.println(b));
		
		System.out.println("-----------------------------Quantity Desc-------------------------------------");
		Comparator<ProductDTO> product3=(t1,t2)->Integer.compare(t2.getQuantity(), t1.getQuantity());
		collection.stream().sorted(product3).forEach(b->System.out.println(b));
		
		System.out.println("-----------------------------Model Asc-------------------------------------");
		Comparator<ProductDTO> product4=(t1,t2)->Integer.compare(t1.getModelNo(),t2.getModelNo());
		collection.stream().sorted(product4).forEach(c->System.out.println(c));
		
		System.out.println("-----------------------------Model Desc-------------------------------------");
		Comparator<ProductDTO> product5=(t1,t2)->Integer.compare(t2.getModelNo(),t1.getModelNo());
		collection.stream().sorted(product5).forEach(c->System.out.println(c));
		
		System.out.println("-------------------------------Serial Asc-----------------------------------");
		Comparator<ProductDTO> product6=(t1,t2)->Integer.compare(t1.getSerialNo(), t2.getSerialNo());
		collection.stream().sorted(product6).forEach(c->System.out.println(c));
		
		System.out.println("-------------------------------Serial Desc-----------------------------------");
		Comparator<ProductDTO> product7=(t1,t2)->Integer.compare(t2.getSerialNo(), t1.getSerialNo());
		collection.stream().sorted(product7).forEach(c->System.out.println(c));
		
		System.out.println("-------------------------------Name Asc------------------------------------");
		Comparator<ProductDTO> product8=(t1,t2)->t1.getName().compareTo(t2.getName());
		collection.stream().sorted(product8).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------Name Desc------------------------------------");
		Comparator<ProductDTO> product9=(t1,t2)->t2.getName().compareTo(t1.getName());
		collection.stream().sorted(product9).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------Description Asc--------------------------------");
		Comparator<ProductDTO> product10=(t1,t2)->t1.getDescription().compareTo(t2.getDescription());
		collection.stream().sorted(product10).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------Description Desc---------------------------------");
		Comparator<ProductDTO> product11=(t1,t2)->t2.getDescription().compareTo(t1.getDescription());
		collection.stream().sorted(product11).forEach(a->System.out.println(a));
		
		System.out.println("------------------------------Company Asc-----------------------------------");
		Comparator<ProductDTO> product12=(t1,t2)->t1.getCompany().compareTo(t2.getCompany());
		collection.stream().sorted(product12).forEach(a->System.out.println(a));
		
		System.out.println("------------------------------Company Desc-----------------------------------");
		Comparator<ProductDTO> product13=(t1,t2)->t2.getCompany().compareTo(t1.getCompany());
		collection.stream().sorted(product13).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------Packer Asc---------------------------------------");
		Comparator<ProductDTO> product14=(t1,t2)->t1.getPacker().compareTo(t2.getPacker());
		collection.stream().sorted(product14).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------Packer Desc---------------------------------------");
		Comparator<ProductDTO> product15=(t1,t2)->t2.getPacker().compareTo(t1.getPacker());
		collection.stream().sorted(product15).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------Included Asc----------------------------------");
		Comparator<ProductDTO> product16=(t1,t2)->t1.getIncluded().compareTo(t2.getIncluded());
		collection.stream().sorted(product16).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------Included Desc----------------------------------");
		Comparator<ProductDTO> product17=(t1,t2)->t2.getIncluded().compareTo(t1.getIncluded());
		collection.stream().sorted(product17).forEach(a->System.out.println(a));
		
		System.out.println("----------------------------------GenericName Asc------------------------------");
		Comparator<ProductDTO> product18=(t1,t2)->t1.getGenericName().compareTo(t2.getGenericName());
		collection.stream().sorted(product18).forEach(a->System.out.println(a));
		
		System.out.println("----------------------------------GenericName Desc------------------------------");
		Comparator<ProductDTO> product19=(t1,t2)->t2.getGenericName().compareTo(t1.getGenericName());
		collection.stream().sorted(product19).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------Asin Asc------------------------------------------");
		Comparator<ProductDTO> product20=(t1,t2)->t1.getAsign().compareTo(t2.getAsign());
		collection.stream().sorted(product20).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------Asin Desc------------------------------------------");
		Comparator<ProductDTO> product21=(t1,t2)->t2.getAsign().compareTo(t1.getAsign());
		collection.stream().sorted(product21).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------CountryOfOrigin Asc------------------------------------");
		Comparator<ProductDTO> product22=(t1,t2)->t1.getCountryOfOrigin().compareTo(t2.getCountryOfOrigin());
		collection.stream().sorted(product22).forEach(a->System.out.println(a));

		System.out.println("-------------------------------CountryOfOrigin Desc------------------------------------");
		Comparator<ProductDTO> product23=(t1,t2)->t2.getCountryOfOrigin().compareTo(t1.getCountryOfOrigin());
		collection.stream().sorted(product23).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------PrimeDelivery Asc-------------------------------------------");
		Comparator<ProductDTO> product24=(t1,t2)->t1.getPrimeDelivery().compareTo(t2.getPrimeDelivery());
		collection.stream().sorted(product24).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------PrimeDelivery Desc-------------------------------------------");
		Comparator<ProductDTO> product25=(t1,t2)->t2.getPrimeDelivery().compareTo(t1.getPrimeDelivery());
		collection.stream().sorted(product25).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------Rating Asc-------------------------------------------");
		Comparator<ProductDTO> product26=(t1,t2)->Float.compare(t1.getRating(), t2.getRating());
		collection.stream().sorted(product26).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------Rating Desc-------------------------------------------");
		Comparator<ProductDTO> product27=(t1,t2)->Float.compare(t2.getRating(), t1.getRating());
		collection.stream().sorted(product27).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRated Asc-------------------------------------------");
		Comparator<ProductDTO> product28=(t1,t2)->Float.compare(t1.getPeopleRated(), t2.getPeopleRated());
		collection.stream().sorted(product28).forEach(a->System.out.println(a));

		System.out.println("--------------------------------------PeopleRated Desc-------------------------------------------");
		Comparator<ProductDTO> product29=(t1,t2)->Float.compare(t2.getPeopleRated(), t1.getPeopleRated());
		collection.stream().sorted(product29).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedFive Asc-------------------------------------------");
		Comparator<ProductDTO> product30=(t1,t2)->Float.compare(t1.getPeopleRatedFive(), t2.getPeopleRatedFive());
		collection.stream().sorted(product30).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedFive Desc-------------------------------------------");
		Comparator<ProductDTO> product31=(t1,t2)->Float.compare(t2.getPeopleRatedFive(), t1.getPeopleRatedFive());
		collection.stream().sorted(product31).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedFour Asc-------------------------------------------");
		Comparator<ProductDTO> product32=(t1,t2)->Float.compare(t1.getPeopleRatedFour(), t2.getPeopleRatedFour());
		collection.stream().sorted(product32).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedFour Desc-------------------------------------------");
		Comparator<ProductDTO> product33=(t1,t2)->Float.compare(t2.getPeopleRatedFour(), t1.getPeopleRatedFour());
		collection.stream().sorted(product33).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedThree Asc-------------------------------------------");
		Comparator<ProductDTO> product34=(t1,t2)->Float.compare(t1.getPeopleRatedThree(), t2.getPeopleRatedThree());
		collection.stream().sorted(product34).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedThree Desc-------------------------------------------");
		Comparator<ProductDTO> product35=(t1,t2)->Float.compare(t2.getPeopleRatedThree(), t1.getPeopleRatedThree());
		collection.stream().sorted(product35).forEach(a->System.out.println(a));

		System.out.println("--------------------------------------PeopleRatedTwo Asc-------------------------------------------");
		Comparator<ProductDTO> product36=(t1,t2)->Float.compare(t1.getPeopleRatedTwo(), t2.getPeopleRatedTwo());
		collection.stream().sorted(product36).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedTwo Desc-------------------------------------------");
		Comparator<ProductDTO> product37=(t1,t2)->Float.compare(t2.getPeopleRatedTwo(), t1.getPeopleRatedTwo());
		collection.stream().sorted(product37).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedOne Asc-------------------------------------------");
		Comparator<ProductDTO> product38=(t1,t2)->Float.compare(t1.getPeopleRatedOne(), t2.getPeopleRatedOne());
		collection.stream().sorted(product38).forEach(a->System.out.println(a));
		
		System.out.println("--------------------------------------PeopleRatedOne Desc-------------------------------------------");
		Comparator<ProductDTO> product39=(t1,t2)->Float.compare(t2.getPeopleRatedOne(), t1.getPeopleRatedOne());
		collection.stream().sorted(product39).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------------------Price Asc-------------------------------------------");
		Comparator<ProductDTO> product40=(t1,t2)->Double.compare(t1.getPrice(), t2.getPrice());
		collection.stream().sorted(product40).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------------------Price Desc-------------------------------------------");
		Comparator<ProductDTO> product41=(t1,t2)->Double.compare(t2.getPrice(), t1.getPrice());
		collection.stream().sorted(product41).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------------------Discount Asc-------------------------------------------");
		Comparator<ProductDTO> product42=(t1,t2)->Double.compare(t1.getDiscount(), t2.getDiscount());
		collection.stream().sorted(product42).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------------------Discount Desc-------------------------------------------");
		Comparator<ProductDTO> product43=(t1,t2)->Double.compare(t2.getDiscount(), t1.getDiscount());
		collection.stream().sorted(product43).forEach(a->System.out.println(a));

		System.out.println("-------------------------------itemWeight Asc-----------------------------------------------");
		Comparator<ProductDTO> product44=(t1,t2)->Double.compare(t1.getItemWeight(), t2.getItemWeight());
		collection.stream().sorted(product44).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------------------itemWeight Desc-------------------------------------------");
		Comparator<ProductDTO> product45=(t1,t2)->Double.compare(t2.getItemWeight(), t1.getItemWeight());
		collection.stream().sorted(product45).forEach(a->System.out.println(a));
		
		System.out.println("-------------------------------Warranty Asc-----------------------------------------------");
		Comparator<ProductDTO> product46=(t1,t2)->Double.compare(t1.getWarranty(), t2.getWarranty());
		collection.stream().sorted(product46).forEach(a->System.out.println(a));
		
		System.out.println("---------------------------------------Warranty Desc-------------------------------------------");
		Comparator<ProductDTO> product47=(t1,t2)->Double.compare(t2.getWarranty(), t1.getWarranty());
		collection.stream().sorted(product47).forEach(a->System.out.println(a));
		
		System.out.println("----------------------------------Damaged Asc-------------------------------------------");
		Comparator<ProductDTO> product48=(t1,t2)->Boolean.compare(t1.isDamaged(), t2.isDamaged());
		collection.stream().sorted(product48).forEach(a->System.out.println(a));
		
		System.out.println("----------------------------------Damaged Desc-------------------------------------------");
		Comparator<ProductDTO> product49=(t1,t2)->Boolean.compare(t2.isDamaged(), t1.isDamaged());
		collection.stream().sorted(product49).forEach(a->System.out.println(a));
		
		System.out.println("----------------------------------Returnable Asc-------------------------------------------");
		Comparator<ProductDTO> product50=(t1,t2)->Boolean.compare(t1.isReturnable(), t2.isReturnable());
		collection.stream().sorted(product50).forEach(a->System.out.println(a));
		
		System.out.println("----------------------------------Returnable Desc-------------------------------------------");
		Comparator<ProductDTO> product51=(t1,t2)->Boolean.compare(t2.isReturnable(), t1.isReturnable());
		collection.stream().sorted(product51).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------manfDate Asc--------------------------------------------");
		Comparator<ProductDTO> product52=(t1,t2)->t1.getManfDate().compareTo(t2.getManfDate());
		collection.stream().sorted(product52).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------manfDate Desc--------------------------------------------");
		Comparator<ProductDTO> product53=(t1,t2)->t2.getManfDate().compareTo(t1.getManfDate());
		collection.stream().sorted(product53).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------Expdate Asc--------------------------------------------");
		Comparator<ProductDTO> product54=(t1,t2)->t1.getExpiryDate().compareTo(t2.getExpiryDate());
		collection.stream().sorted(product52).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------ExpDate Desc--------------------------------------------");
		Comparator<ProductDTO> product55=(t1,t2)->t2.getExpiryDate().compareTo(t1.getExpiryDate());
		collection.stream().sorted(product53).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------DateFirstAvailable Asc--------------------------------------------");
		Comparator<ProductDTO> product56=(t1,t2)->t1.getDateFirstAvailable().compareTo(t2.getDateFirstAvailable());
		collection.stream().sorted(product56).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------DateFirstAvailable Desc--------------------------------------------");
		Comparator<ProductDTO> product57=(t1,t2)->t2.getDateFirstAvailable().compareTo(t1.getDateFirstAvailable());
		collection.stream().sorted(product57).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------DeliveryExpectedDate Asc--------------------------------------------");
		Comparator<ProductDTO> product58=(t1,t2)->t1.getDeliveryExpectedDate().compareTo(t2.getDeliveryExpectedDate());
		collection.stream().sorted(product58).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------DeliveryExpectedDate Desc--------------------------------------------");
		Comparator<ProductDTO> product59=(t1,t2)->t2.getDeliveryExpectedDate().compareTo(t1.getDeliveryExpectedDate());
		collection.stream().sorted(product59).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------ReturnBy Asc--------------------------------------------");
		Comparator<ProductDTO> product60=(t1,t2)->t1.getReturnBy().compareTo(t2.getReturnBy());
		collection.stream().sorted(product60).forEach(a->System.out.println(a));
		
		System.out.println("-----------------------------------ReturnBy Desc--------------------------------------------");
		Comparator<ProductDTO> product61=(t1,t2)->t2.getReturnBy().compareTo(t1.getReturnBy());
		collection.stream().sorted(product61).forEach(a->System.out.println(a));
		
		System.out.println("-----------------3 property in asc------------------------------------");
		collection.stream().sorted(product.thenComparing(product2).thenComparing(product4)).forEach(a->System.out.println(a));
		collection.stream().sorted(product6.thenComparing(product8).thenComparing(product10)).forEach(a->System.out.println(a));
		collection.stream().sorted(product12.thenComparing(product14).thenComparing(product16)).forEach(a->System.out.println(a));	
		collection.stream().sorted(product18.thenComparing(product20).thenComparing(product22)).forEach(a->System.out.println(a));
		collection.stream().sorted(product24.thenComparing(product26).thenComparing(product28)).forEach(a->System.out.println(a));
		collection.stream().sorted(product30.thenComparing(product32).thenComparing(product34)).forEach(a->System.out.println(a));
		collection.stream().sorted(product36.thenComparing(product38).thenComparing(product40)).forEach(a->System.out.println(a));
		collection.stream().sorted(product42.thenComparing(product44).thenComparing(product46)).forEach(a->System.out.println(a));
		collection.stream().sorted(product48.thenComparing(product50).thenComparing(product52)).forEach(a->System.out.println(a));
		collection.stream().sorted(product54.thenComparing(product56).thenComparing(product58)).forEach(a->System.out.println(a));
		
		System.out.println("--------------------2 Property in Desc----------------------------------");
		collection.stream().sorted(product1.thenComparing(product3)).forEach(a->System.out.println(a));
 		collection.stream().sorted(product5.thenComparing(product7)).forEach(a->System.out.println(a));
		collection.stream().sorted(product9.thenComparing(product11)).forEach(a->System.out.println(a));
		collection.stream().sorted(product13.thenComparing(product15)).forEach(a->System.out.println(a));
		collection.stream().sorted(product17.thenComparing(product19)).forEach(a->System.out.println(a));	
		collection.stream().sorted(product21.thenComparing(product23)).forEach(a->System.out.println(a));
		collection.stream().sorted(product25.thenComparing(product27)).forEach(a->System.out.println(a));
		collection.stream().sorted(product29.thenComparing(product31)).forEach(a->System.out.println(a));
		collection.stream().sorted(product33.thenComparing(product35)).forEach(a->System.out.println(a));
		collection.stream().sorted(product37.thenComparing(product39)).forEach(a->System.out.println(a));
	
		System.out.println("--------------------------------------------------------------------------------");
		
		collection.stream().map(b->b.getId()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getQuantity()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getModelNo()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getSerialNo()).collect(Collectors.toList()).forEach(c->System.out.println(c));	
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getName()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getDescription()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getCompany()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPacker()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getIncluded()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getGenericName()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getAsign()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getCountryOfOrigin()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPrimeDelivery()).collect(Collectors.toList()).forEach(c->System.out.println(c));	
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getRating()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPeopleRated()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPeopleRatedFive()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPeopleRatedFour()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPeopleRatedThree()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPeopleRatedTwo()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPeopleRatedOne()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getPrice()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getDiscount()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getWarranty()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getItemWeight()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.isDamaged()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.isReturnable()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getManfDate()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getExpiryDate()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getDateFirstAvailable()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getDeliveryExpectedDate()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		System.out.println("--------------------------------------------------------------------------------");
		collection.stream().map(b->b.getReturnBy()).collect(Collectors.toList()).forEach(c->System.out.println(c));
		
	}

}
