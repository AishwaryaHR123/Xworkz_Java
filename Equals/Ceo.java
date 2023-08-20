package com.xworkz.Equals;

public class Ceo {
	private String company;
	private int since;
	private int experience;
	private String qualitification;
	private String ceoName;
	private String nationality;

	public Ceo() {
	}

	public Ceo(String company, int since, int experience, String qualitification, String ceoName, String nationality) {
		super();
		this.company = company;
		this.since = since;
		this.experience = experience;
		this.qualitification = qualitification;
		this.ceoName = ceoName;
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "company=" + company + ", since=" + since + ", experience=" + experience + ", qualitification="
				+ qualitification + ", ceoName=" + ceoName + ", nationality=" + nationality + "";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in Ceo");
		if (obj != null) {
			System.out.println("object is not null");
			if (obj instanceof Ceo) {
				System.out.println("object is a Ceo");
				Ceo casted = (Ceo) obj;
				Ceo currentInstance = this;
				if (casted.company.equals(currentInstance.company) && casted.ceoName.equals(currentInstance.ceoName)) {
					System.out.println("Ceo name and CompanyName are same");
					return true;
				}

				else {
					System.err.println("Ceo name and CompanyName are not same");
				}

			}
		} else {
			System.err.println("object is null");
		}
		return super.equals(obj);
	}

}
