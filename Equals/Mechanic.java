package com.xworkz.Equals;

public class Mechanic {
	private String mechanicName;
	private int age;
	private int experience;
	private boolean serviceGood;
	private String location;
	private String qualification;

	public Mechanic() {

	}

	public Mechanic(String mechanicName, int age, int experience, boolean serviceGood, String location,
			String qualification) {
		super();
		this.mechanicName = mechanicName;
		this.age = age;
		this.experience = experience;
		this.serviceGood = serviceGood;
		this.location = location;
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "mechanicName=" + mechanicName + ", age=" + age + ", experience=" + experience + ", serviceGood="
				+ serviceGood + ", location=" + location + ", qualification=" + qualification + "";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in Mechanic");
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Mechanic) {
				System.out.println("object is a Mechanic");
				Mechanic casted = (Mechanic) obj;
				Mechanic currentInstance = this;
				if (casted.mechanicName.equals(currentInstance.mechanicName) && casted.age == currentInstance.age
						&& casted.serviceGood == currentInstance.serviceGood
						&& casted.location.equals(currentInstance.location)) {
					System.out.println("mechanicName,serviceGood,age,location are same");
					return true;
				}

				else {
					System.err.println("mechanicName,serviceGood,age,location are not same");
				}

			}
		} else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}

}
