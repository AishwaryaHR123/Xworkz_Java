class PowerInfoKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in PowerInfoKiller");
		Power power=new Power("24 ohms",120);
		power.printStatic();
		power.printInstance();
	}
}