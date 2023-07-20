class Fabric{
	static int getPrice(String fabricName){
		System.out.println("Invoking getPrice in Fabric");
		if(fabricName!=null){
			System.out.println("Fabric name is valid");
			if("Cotton"==fabricName){
				return 500;
			}
			if("Nylon"==fabricName){
				return 200;
			}
			if("Woolen"==fabricName){
				return 600;
			}
			if("linen"==fabricName){
				return 250;
			}
			if("Polyster"==fabricName){
				return 300;
			}
			if("Silk"==fabricName){
				return 400;
			}
	    else{
			System.out.println("Fabric name is in-valid");
		}
		}
		return 99;
	}
}