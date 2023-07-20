class Wallet{
	String brand;
	float price;
	String color;
	
	Wallet()
	{
		System.out.println("invoking no-arguments in Wallet");
		System.out.println("Brand of the wallet:"+this.brand);
		System.out.println("Price of the wallet:"+this.price);
		System.out.println("color of the wallet:"+this.color);
	}
	Wallet(String brand,float price,String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
		System.out.println("invoking in Wallet");
		System.out.println("Brand of the wallet:"+this.brand);
		System.out.println("Price of the wallet:"+this.price);
		System.out.println("color of the wallet:"+this.color);
	}
	
	
}