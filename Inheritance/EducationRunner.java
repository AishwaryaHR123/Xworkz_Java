package com.xworkz.Inheritance;

public class EducationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in EducationRunner");
		Education education=new Education();
		Education education1=new Primary();
		Education education2=new Secondary();
		Education education3=new Engineering();
		Education education4=new Cse();
		Education education5=new DataScience();
		education.educationInfo();
		System.out.println(education.name);
		
		Primary primary=new Primary();
		Primary primary1=new Secondary();
		Primary primary2=new Engineering();
		Primary primary3=new Cse();
		Primary primary4=new DataScience();
		primary.primaryInfo();
		System.out.println(primary.studentName);
		
		Secondary secondary=new Secondary();
		Secondary secondary1=new Engineering();
		Secondary secondary2=new Cse();
		Secondary secondary3=new DataScience();
		secondary.secondaryInfo();
		System.out.println(secondary.specification);
		
		Engineering engineering=new Engineering();
		Engineering engineering1=new Cse();
		Engineering engineering2=new DataScience();
		engineering.engineeringInfo();
		System.out.println(engineering.specialization);
		
		Cse cse=new Cse();
		Cse cse1=new DataScience();
		cse.cseInfo();
		System.out.println(cse.branch);
		
		DataScience dataScience=new DataScience();
		dataScience.dataScienceInfo();
		System.out.println(dataScience.passingYear);



	}

}
