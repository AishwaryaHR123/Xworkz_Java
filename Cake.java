class Cake{
	static void tasty(String name,String type,String bakeryName,int price,int noOfPieces,String occassion){
		System.out.println("invoking tasty in cake : ");
		if(name!=null)
		{
			System.out.println("condition is valid: "+name);
		}
		else
		{
			System.err.println("condition is invalid: "+name);
			return;
		}
		if(type!=null)
		{
			System.out.println("condition is valid: "+type);	
		}
		else
		{
			System.err.println("condition is invalid: "+type);
			return;
		}
		if(bakeryName!=null)
		{
			System.out.println("condition is valid: "+bakeryName);	
		}
		else{
			System.err.println("condition is invalid: "+bakeryName);
			return;
		}
		if(price>=40)
		{
			System.out.println("condition is valid: "+price);	
		}
		else
		{
			System.err.println("condition is invalid: "+price);
			return;
		}
		if(noOfPieces>=1)
		{
			System.out.println("condition is valid: "+noOfPieces);	
		}
		else
		{
			System.err.println("condition is invalid: "+noOfPieces);
			return;
		}
		if(occassion!=null)
		{
			System.out.println("condition is valid: "+occassion);	
		}
		else
		{
			System.err.println("condition is invalid: "+occassion);
			return;
		}			
	}
}

			

			