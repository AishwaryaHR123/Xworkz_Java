class Kulfi{
	static void kulfiInfo(String type,int price,String color){
		if(type!=null)
		{
			System.out.println("condition is valid: "+type);
		}
		else
		{
			System.err.println("condition is invalid: "+type);
			return;
		}
		if(price<=5000 )
		{
			System.out.println("condition is valid: "+price);
		}
		else
		{
			System.err.println("condition is invalid: "+price);
			return;
		}
		if(color!=null)
		{
			System.out.println("condition is valid: "+color);
		}
		else
		{
			System.err.println("condition is invalid: "+color);
			return;
		}
	}
}