package com.xworkz.Inheritance;

public class CompanyRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in  CompanyRunner ");
		Company company=new Company();
		Company company1=new Founder();
		Company company2=new Ceo();
		Company company3=new Job();
		Company company4=new JobRole();
		Company company5=new Employee();
		Company company6=new FullTime();
		Company company7=new PartTimeEmployee();
		Company company8=new Salary();
		company.companyInfo();
		System.out.println(company.name);
		Founder founder1=new Founder();
		Founder founder2=new Ceo();
		Founder founder3=new Job();
		Founder founder4=new JobRole();
		Founder founder5=new Employee();
		Founder founder6=new FullTime();
		Founder founder7=new PartTimeEmployee();
		Founder founder8=new Salary();
		founder1.founderInfo();
		System.out.println(founder1.year);
		Ceo ceo1=new Ceo();
		Ceo ceo2=new Job();
		Ceo ceo3=new JobRole();
		Ceo ceo4=new Employee();
		Ceo ceo5=new FullTime();
		Ceo ceo6=new PartTimeEmployee();
		Ceo ceo7=new Salary();
		ceo1.ceoInfo();
		System.out.println(ceo1.ceoName);
		Job job1=new Job();
		Job job2=new JobRole();
		Job job3=new Employee();
		Job job4=new FullTime();
		Job job5=new PartTimeEmployee();
		Job job6=new Salary();
		job1.jobInfo();
		System.out.println(job1.salary);
		JobRole jobRole1=new JobRole();
		JobRole jobRole2=new Employee();
		JobRole jobRole3=new FullTime();
		JobRole jobRole4=new PartTimeEmployee();
		JobRole jobRole5=new Salary();
		jobRole1.roleInfo();
		System.out.println(jobRole1.roleName);
		Employee employee1=new Employee();
		Employee employee2=new FullTime();
		Employee employee3=new PartTimeEmployee();
		Employee employee4=new Salary();
		employee1.employeeInfo();
		System.out.println(employee1.employeeId);
		FullTime fullTime1=new FullTime();
		FullTime fullTime2=new PartTimeEmployee();
		FullTime fullTime3=new Salary();
		fullTime1.fullTimeInfo();
		System.out.println(fullTime1.fullTimeSalary);
		PartTimeEmployee partTimeEmployee1=new PartTimeEmployee();
		PartTimeEmployee partTimeEmployee2=new Salary();
		partTimeEmployee1.partTimeInfo();
		System.out.println(partTimeEmployee1.timings);
		Salary salary=new Salary();
		salary.salaryInfo();
		System.out.println(salary.salary);

		
	}

}
