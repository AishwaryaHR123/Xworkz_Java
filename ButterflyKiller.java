class ButterflyKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in ButterflyKiller");
		Butterfly butterfly=new Butterfly("12 inches","1 Week");
		butterfly.printStatic();
		butterfly.printInstance();
	}
}