class Carrom{
	String material;
	int noOfPlayer;
	String name;
	int price;
	String coinColor;
	Carrom()
	{
		System.out.println("Invoking no arguements");
	}
	Carrom(String material)
	{
		System.out.println("passing material:"+material);
		this.material=material;
	}
	Carrom(String material,int noOfPlayer)
	{
		System.out.println("Invoking String int constructor of Carrom");
		System.out.println("passing material:"+material);
		System.out.println("passing noOfPlayer:"+noOfPlayer);
		this.material=material;
		this.noOfPlayer=noOfPlayer;
	}
	Carrom(String material,int noOfPlayer,String name)
	{
		System.out.println("Invoking String int constructor of Carrom");
		System.out.println("passing material:"+material);
		System.out.println("passing noOfPlayer:"+noOfPlayer);
		System.out.println("passing name:"+name);
		this.material=material;
		this.noOfPlayer=noOfPlayer;
		this.name=name;
	}
	Carrom(String material,int noOfPlayer,String name,int price)
	{
		System.out.println("Invoking String int constructor of Carrom");
		System.out.println("passing material:"+material);
		System.out.println("passing noOfPlayer:"+noOfPlayer);
		System.out.println("passing name:"+name);
		System.out.println("passing Price:"+price);
		this.material=material;
		this.noOfPlayer=noOfPlayer;
		this.name=name;
		this.price=price;
	}
	Carrom(String material,int noOfPlayer,String name,int price,String coinColor)
	{
		System.out.println("Invoking String int constructor of Carrom");
		System.out.println("passing material:"+material);
		System.out.println("passing noOfPlayer:"+noOfPlayer);
		System.out.println("passing name:"+name);
		System.out.println("passing Price:"+price);
		System.out.println("passing coinColor:"+coinColor);
		this.material=material;
		this.noOfPlayer=noOfPlayer;
		this.name=name;
		this.price=price;
		this.coinColor=coinColor;
	}
}
	
		