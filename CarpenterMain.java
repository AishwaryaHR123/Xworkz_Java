class CarpenterMain{
	public static void main(String[] args)
	{
		System.out.println("Invoking carpenter in CarpenterMain");
		Carpenter.cut();
		Carpenter.cut(1000);
		Carpenter.cut(1500,6);
		Carpenter.polishing("Door");
		Carpenter.polishing("door",500);
		Carpenter.repair(500);
		Carpenter.framing("window");
		Carpenter.shape("Square");
		Carpenter.phoneNo(9658456985l);
		//Carpenter.window();
		
	}
}