class MainKiller{
	public static void main(String[] args)
	{
		System.out.println("Running mian in MainKiller");
		Wood wood1=new Wood("Window",300d,"Oak",6.67f,5.67f);
		Wood wood2=new Wood("Window",300,"Oak");
		Wood wood3=new Wood("Window");
		
		System.out.println(".................................................");
		Mall mall1=new Mall("orion","SandalSoap Factory","Peter-England",1000,50,true,9);
		Mall mall2=new Mall("Orion","SandalSoap Factory","peter-England");
		Mall mall3=new Mall("Orion","SandalSoap Factory");
		
		System.out.println(".................................................");
		Park park1=new Park("cubbon Park",100,"Vidhana Soudha",50,"Walking Trails",5,3,"Sports",true);
		Park park2=new Park("cubbon Park",100,"Vidhana Soudha",50);
		Park park3=new Park("cubbon Park",100);
	}
}