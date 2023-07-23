class SoilKiller{
	public static void main(String[] args)
	{
		System.out.println("Running main in SoilKiller");
		Soil soil=new Soil("Sand","High");
		soil.printStatic();
		soil.printInstance();
	}
}