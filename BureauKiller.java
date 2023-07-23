class BureauKiller{
	public static void main(String[] args)
	{
		System.out.println("Invoking main in BureauKiller");
		Bureau bureau=new Bureau("Brown",9000);
		bureau.printStatic();
		bureau.printInstance();
	}
}