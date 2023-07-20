class Trainer{
	static void role()
	{
		System.out.println("Running role in Trainer");
		String name="Omkar";
		int experience=13;
		System.out.println("Trainer name :"+name);
		System.out.println("Experience of the trainer :"+experience);
	}
	static void role(String name)
	{
		System.out.println("Trainer name :"+name);
	}
	static void role(String name,int experience)
	{
		System.out.println("Trainer name :"+name);
		System.out.println("Experience of the trainer :"+experience);
	}
	static void activity(String presentation)
	{
		System.out.println("Running activity in Trainer");
		System.out.println("Presentation :"+presentation);
	}
	static void activity(String presentation,String name)
	{
		System.out.println("Presentation :"+presentation);
		System.out.println("Activity name :"+name);
	}
	static void teaching(int experience,int rating)
	{
		System.out.println("Running  in Trainer");
		System.out.println("Rating of the presentation :"+rating);
	}
	static void experience(int years)
	{
		System.out.println("Experience of the trainer :"+years);
	}
	static void session(float time)
	{
		System.out.println("Session time :"+time);
	}
	static void name(String name)
	{
		System.out.println("Name of the trainer :"+name);
	}
	static void evaluation()
	{
		visualization();
		System.out.println("Evaluation by the trainer");
	}
	static void visualization()
	{
		support();
		System.out.println("Running running in Trainer");
	}
	static void assesment()
	{
		System.out.println("number of assesments given by the trainer");
	}
	static void support()
	{
		System.out.println("Support of the trainer in the training");
	}
}