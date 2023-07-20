class JacketKiller{
	public static void main(String[] args)
	{
		System.out.println("running main in the JacketKiller");
		Jacket jacket1=new Jacket();
		System.out.println(jacket1.brand);
		System.out.println(jacket1.size);
		System.out.println(jacket1.color);
		System.out.println(jacket1.price);
		System.out.println(jacket1.type);
		
		System.out.println("=======================");
		jacket1.brand="PeterEngland";
		jacket1.size=28;
		jacket1.color="black";
		jacket1.price=50.00f;
		jacket1.type="cotton";
		System.out.println(jacket1.brand);
		System.out.println(jacket1.size);
		System.out.println(jacket1.color);
		System.out.println(jacket1.price);
		System.out.println(jacket1.type);
		
		System.out.println("----------------Jacket2-------------------");
		Jacket jacket2=new Jacket();
		System.out.println(jacket2.brand);
		System.out.println(jacket2.size);
		System.out.println(jacket2.color);
		System.out.println(jacket2.price);
		System.out.println(jacket2.type);
		
		System.out.println("=======================");
		jacket2.brand="levis";
		jacket2.size=35;
		jacket2.color="white";
		jacket2.price=500.00f;
		jacket2.type="woolen";
		System.out.println(jacket2.brand);
		System.out.println(jacket2.size);
		System.out.println(jacket2.color);
		System.out.println(jacket2.price);
		System.out.println(jacket2.type);
		
	}
}
		
	