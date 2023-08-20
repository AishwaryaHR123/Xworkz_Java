package com.xworkz.Equals;

public class Minister {
	private String ministerName;
	private String location;
	private int age;
	private String gender;
	private String politicalParty;
	private String qualification;

	public Minister() {
	}

	public Minister(String ministerName, String location, int age, String gender, String politicalParty,
			String qualification) {
		super();
		this.ministerName = ministerName;
		this.location = location;
		this.age = age;
		this.gender = gender;
		this.politicalParty = politicalParty;
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		System.out.println("toString override");
		return "ministerName=" + ministerName + ", location=" + location + ", age=" + age + ", gender=" + gender
				+ ", politicalParty=" + politicalParty + ", qualification=" + qualification + "";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in Minister");
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Minister) {
				System.out.println("object is a minister");
				Minister casted = (Minister) obj;
				if (casted.ministerName.equals(ministerName)) {
					System.out.println("Minister name is same");
					return true;
				} else {
					System.err.println("minister name is not same");
				}
			} else {
				System.err.println("object is not a minister");
			}
		} else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}

}
