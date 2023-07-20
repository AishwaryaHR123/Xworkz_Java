class Camera{
	static void click(String location,int date, int howManyPeople,String resolution,String clarity,String cameraMan)
	{
		if(location!=null)
		{
			System.out.println("condition is valid: "+location);
		}
		else
		{
			System.err.println("condition is invalid: "+location);
			return;
		}
		if(date==7)
		{
			System.out.println("condition is valid: "+date);	
		}
		else
		{
			System.err.println("condition is invalid: "+date);
			return;
		}
		if(howManyPeople>=3)
		{
			System.out.println("condition is valid: "+howManyPeople);	
		}
		else{
			System.err.println("condition is invalid: "+howManyPeople);
			return;
		}
		if(resolution!=null)
		{
			System.out.println("condition is valid: "+resolution);	
		}
		else
		{
			System.err.println("condition is invalid: "+resolution);
			return;
		}
		if(clarity!=null)
		{
			System.out.println("condition is valid: "+clarity);	
		}
		else
		{
			System.err.println("condition is invalid: "+clarity);
			return;
		}
		if(cameraMan!=null)
		{
			System.out.println("condition is valid: "+cameraMan);	
		}
		else
		{
			System.err.println("condition is invalid: "+cameraMan);
			return;
		}
	}
}	