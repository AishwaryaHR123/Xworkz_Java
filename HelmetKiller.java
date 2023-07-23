class HelmetKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in HelmetKiller");
		Helmet helmet=new Helmet("Blue",900);
		helmet.printStatic();
		helmet.printInstance();
	}
}
