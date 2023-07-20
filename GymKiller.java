class GymKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in the GymKiller");
		Gym gym1=new Gym();
		System.out.println(gym1.trainer);
		System.out.println(gym1.trainee);
		System.out.println(gym1.cost);
		System.out.println(gym1.duration);
		System.out.println(gym1.component);
		gym1.trainer="Punith";
		gym1.trainee="Aishu";
		gym1.cost=5000;
		gym1.duration="one-month";
		gym1.component="Dumbbells";
		
		System.out.println("=======================");
		System.out.println(gym1.trainer);
		System.out.println(gym1.trainee);
		System.out.println(gym1.cost);
		System.out.println(gym1.duration);
		System.out.println(gym1.component);
		
		System.out.println("==========gym2============");
		Gym gym2=new Gym();
		System.out.println(gym2.trainer);
		System.out.println(gym2.trainee);
		System.out.println(gym2.cost);
		System.out.println(gym2.duration);
		System.out.println(gym2.component);
		gym2.trainer="rohit";
		gym2.trainee="pooja";
		gym2.cost=6000;
		gym2.duration="two-month";
		gym2.component="Barbells";
		
		System.out.println("=======================");
		System.out.println(gym2.trainer);
		System.out.println(gym2.trainee);
		System.out.println(gym2.cost);
		System.out.println(gym2.duration);
		System.out.println(gym2.component);
	}
}
		