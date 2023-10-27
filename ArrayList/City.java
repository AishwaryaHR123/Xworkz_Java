package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class City {

	public static void main(String[] args) {
		Collection<String> city=new ArrayList();
		city.add("Chennai");
		city.add("Mumbai");
		city.add("Bengaluru");
		city.add("Hyderbad");
		city.add("Ahmebad");
		city.add("jaipur");
		city.add("indore");
		city.add("Lucknow");
		city.add("pune");
		city.add("surat");
		city.add("Delhi");
		city.add("Kolkata");
		city.add("Kochi");
		city.add("Nagpur");
		city.add("Agra");
		city.add("Madurai");
		city.add("Patna");
		city.add("Mangaluru");
		city.add("Solapur");
		city.add("Coimbatore");
		System.out.println("Total Cities : "+city.size());
		Iterator<String> itr=city.iterator();
		while(itr.hasNext())
		{
			String value=itr.next();
			System.out.println("city is "+value);
		}

	}

}
