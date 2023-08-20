package com.xworkz.Equals;

public class Kalla {
	private String name;
	private int age;
	private String target;
	private String method;
	private String gender;
	private String skills;

	public Kalla() {
	}

	public Kalla(String name, int age, String target, String method, String gender, String skills) {
		super();
		this.name = name;
		this.age = age;
		this.target = target;
		this.method = method;
		this.gender = gender;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", target=" + target + ", method=" + method + ", gender=" + gender
				+ ", skills=" + skills + "";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in Kalla");
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Kalla) {
				System.out.println("object is a Kalla");
				Kalla casted = (Kalla) obj;
				Kalla currentInstance = this;
				if (casted.name.equals(currentInstance.name) && casted.age == currentInstance.age
						&& casted.target.equals(currentInstance.target) && casted.method.equals(currentInstance.method)
						&& casted.gender.equals(currentInstance.gender)
						&& casted.skills.equals(currentInstance.skills)) {
					System.out.println("name,age,target,method,gender,skills are same");
					return true;
				}

				else {
					System.err.println("name,age,target,method,gender,skills are not same");
				}

			}
		} else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}

}
