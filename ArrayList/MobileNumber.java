package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {
		Collection<Long> number = new ArrayList();
		number.add(9591404128l);
		number.add(9901563850l);
		number.add(8291169914l);
		number.add(9108726615l);
		number.add(9961385017l);
		number.add(8934527890l);
		number.add(9108997216l);
		number.add(9108997217l);
		number.add(9108997219l);
		number.add(9988567423l);
		number.add(9345623179l);
		number.add(9190897654l);
		number.add(9187543671l);
		number.add(9561223456l);
		number.add(9254789017l);
		number.add(9765423104l);
		number.add(9345678903l);
		number.add(9547862313l);
		number.add(9587462310l);
		number.add(9863251470l);
		number.add(8965321470l);
		number.add(9362581470l);
		number.add(9856321470l);
		number.add(9563214780l);
		number.add(8963251470l);
		number.add(6363991432l);
		number.add(9821365470l);
		number.add(9563214780l);
		number.add(9536214780l);
		number.add(9586321470l);
		System.out.println("Total Elements : " + number.size());
		Iterator<Long> itr = number.iterator();
		while (itr.hasNext()) {
			Long value = itr.next();
			System.out.println("MobileNumber is : " + value);

		}

	}

}
