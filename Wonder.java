class Wonder{
	public static void main(String[] args)
	{
		System.out.println("Wonders of world:");
		String china="Great wall of China";
		String indiaGate="India Gate";
		String bihar="Nalanda";
		String uttarPradesh="Taj Mahal";
		String egypt="Pyramid";
		String jaipur ="Hawa Mahal";
		String delhi="Qutub Minar";
		String[] wonders={china,indiaGate,bihar,uttarPradesh,egypt,jaipur,delhi};
		int total= wonders.length;
		
		
		System.out.println("................................................................");
		for(int wonderlist=0;wonderlist<wonders.length;wonderlist++)
		{
			String ref=wonders[wonderlist];
			System.out.println("wonders of world "+ref+" index is " +wonderlist);
		}
		System.out.println("The wonder before changing the position: "+wonders[3]);
		wonders[3]="elloraCaves";
		System.out.println("The wonder after changing the position: "+wonders[3]);
		
		System.out.println("...................................................................");
		
		for(int wonderlist=wonders.length-1;wonderlist>=0;wonderlist--)
		{
			String ref=wonders[wonderlist];
			System.out.println("wonders of world "+ref+" index is " +wonderlist);
		}
	}
}
		
		