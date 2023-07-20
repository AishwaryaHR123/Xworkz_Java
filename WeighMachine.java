class WeighMachine{
	static void machineInfo(String brand,int price,int range)
	{
		if(brand!=null)
		{
			System.out.println("condition is valid: "+brand);
		}
		else
		{
			System.err.println("condition is invalid: "+brand);
			return;
		}
		if(price>=6000 && price<=40000)
		{
			System.out.println("condition is valid: "+price);
		}
		else
		{
			System.err.println("condition is invalid: "+price);
			return;
		}
		if(range>=25 && range<=1000)
		{
			System.out.println("condition is valid: "+range);
		}
		else
		{
			System.err.println("condition is invalid: "+range);
			return;
		}
	}
}