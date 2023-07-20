class Trainee{
	static void learning()
	{
		System.out.println("Running learning in trainee");
		String subject="DBMS";
		System.out.println("Subject studied :"+subject);
	}
	static void learning(String subject)
	{
		System.out.println("Running learning in trainee");
		System.out.println("Subject studied :"+subject);
	}
	static void learning(String subject,String technique)
	{
		System.out.println("Running learning in trainee");
		System.out.println("Subject studied :"+subject);
		System.out.println("Technique required :"+technique);
	}
	static void communication(String type)
	{
		System.out.println("Running communication in trainee");
		System.out.println("Type of communication :"+type);	
	}
	static void communication(String type,int rating)
	{
		System.out.println("Running communication in trainee");
		System.out.println("Type of communication :"+type);
		System.out.println("Rating for communication :"+rating);
	}
	static void timeManagement(float time)
	{
		System.out.println("Running timeManagement in trainer");
		System.out.println("Time manegement :"+time);
	}
	static void skill(String set)
	{
		System.out.println("Skill set :"+set);
	}
	static void development()
	{
		System.out.println("Development required during training");
	}
	static void thinking()
	{
		System.out.println("Thinking ability");
	}
	static void problemSolving(String name)
	{
		System.out.println("Problem soling platform :"+name);
	}
	static void goalSetting()
	{
		noteTaking();
		System.out.println("Trainee must set the goal");
	}
	static void noteTaking()
	{
		adaptability();
		System.out.println("Trainee must take note during training");
	}
	static void adaptability()
	{
		System.out.println("Trainee must adapt some good qualities");
	}
}