package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IndianState {
	public static void main(String[] args) {
		Collection<String> state = new ArrayList();
		state.add("Andhra Pradesh");
		state.add("Arunachal Pradesh");
		state.add("Assam");
		state.add("Bihar");
		state.add("Chattisgarh");
		state.add("Goa");
		state.add("Gujarat");
		state.add("Haryana");
		state.add("Himachal Pradesh");
		state.add("Jammu and Kashmir");
		state.add("Jharkhand");
		state.add("Karnataka");
		state.add("Kerala");
		state.add("Madhya Pradesh");
		state.add("Maharashtra");
		state.add("Manipur");
		state.add("Meghalaya");
		state.add("Mizoram");
		state.add("Nagaland");
		state.add("Odisha");
		state.add("Punjab");
		state.add("Rajasthan");
		state.add("Sikkim");
		state.add("Tamil Nadu");
		state.add("Telangana");
		state.add("Tripura");
		state.add("Uttar Pradesh");
		state.add("Uttarakhand");
		state.add("West Bengal");
		System.out.println("Total States :" + state.size());
		Iterator<String> itr = state.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println("State Name is : " + value);
		}

	}
}
