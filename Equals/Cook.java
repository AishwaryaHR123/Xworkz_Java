package com.xworkz.Equals;

public class Cook {
	private int experience;
	private String name;
	private int amountOfTime;
	private int rating;
	private boolean tasteGood;
	private int age;

	public Cook() {
	}

	public Cook(int experience, String name, int amountOfTime, int rating, boolean tasteGood, int age) {
		super();
		this.experience = experience;
		this.name = name;
		this.amountOfTime = amountOfTime;
		this.rating = rating;
		this.tasteGood = tasteGood;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cook experience=" + experience + ", name=" + name + ", amountOfTime=" + amountOfTime + ", rating="
				+ rating + ", tasteGood=" + tasteGood + ", age=" + age + "";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in Cook");
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Cook) {
				System.out.println("object is a Cook");
				Cook casted = (Cook) obj;
				Cook currentInstance = this;
				if (casted.name.equals(currentInstance.name) && casted.age == currentInstance.age
						&& casted.experience == currentInstance.experience
						&& casted.tasteGood == currentInstance.tasteGood
						&& casted.amountOfTime == currentInstance.amountOfTime) {
					System.out.println("name,age,experience,tasteGood,amountOfTime are same");
					return true;
				}

				else {
					System.err.println("name,age,experience,tasteGood,amountOfTime are not same");
				}

			}
		} else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}

}
