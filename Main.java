class Main{
	public static void main(String[] args){
		int ageaishu=PersonInfo.getAgeByName("aishu");
		System.out.println("the age is: " +ageaishu);
		int agepooja=PersonInfo.getAgeByName("pooja");
		System.out.println("the age is: " +agepooja);
		int ageanupama=PersonInfo.getAgeByName("anupama");
		System.out.println("the age is: " +ageanupama);
		int ageusha=PersonInfo.getAgeByName("usha");
		System.out.println("the age is: " +ageusha);
		int agesushma=PersonInfo.getAgeByName("sushma");
		System.out.println("the age is: " +agesushma);
		int ageraqeeb=PersonInfo.getAgeByName("raqeeb");
		System.out.println("the age is: " +ageraqeeb);
		int agejithan=PersonInfo.getAgeByName("jithan");
		System.out.println("the age is: " +agejithan);
		int agejafer=PersonInfo.getAgeByName("jafer");
		System.out.println("the age is: " +agejafer);
		int agechaya=PersonInfo.getAgeByName("chaya");
		System.out.println("the age is: " +agechaya);
		
		System.out.println("..............................................................");
		
		String model=Engine.getCCByModel("1197cc");
		System.out.println("Reference name is: " +model);
		String model1=Engine.getCCByModel("1498cc");
		System.out.println("Reference name is: " + model1);
		String model2=Engine.getCCByModel("2998cc");
		System.out.println("Reference name is: " + model2);
		String model3=Engine.getCCByModel("1993cc");
		System.out.println("Reference name is: " + model3);
		String model4=Engine.getCCByModel("1197cc");
		System.out.println("Reference name is: " + model4);
		String model5=Engine.getCCByModel("1198cc");
		System.out.println("Reference name is: " + model5);
		
		System.out.println("..............................................................");

		int price1=Fabric.getPrice("Cotton");
		System.out.println("Price 1 is:"+price1);
		
		int price2=Fabric.getPrice("Nylon");
		System.out.println("Price 2 is:"+price2);
		
		int price3=Fabric.getPrice("Woolen");
		System.out.println("Price 3 is:"+price3);
		
		int price4=Fabric.getPrice("Linen");
		System.out.println("Price 4 is:"+price4);
		
		int price5=Fabric.getPrice("Polyster");
		System.out.println("Price 5 is:"+price5);
		
		int price6=Fabric.getPrice("Silk");
		System.out.println("Price 6 is:"+price6);
		
		System.out.println("..............................................................");
		
		String aishu = PersonMail.getEmailByName("aishu");
		System.out.println("Reference of mail is: " + aishu);
		
		String sonu = PersonMail.getEmailByName("sonu");
		System.out.println("Reference of mail is: " + sonu);
		
		String rani = PersonMail.getEmailByName("rani");
		System.out.println("Reference of mail is: " + rani);
		
		String sushma = PersonMail.getEmailByName("sushma");
		System.out.println("Reference of mail is: " + sushma);
		
		String shivu = PersonMail.getEmailByName("shivu");
		System.out.println("Reference of mail is: " + shivu);
		
		String spoorthi = PersonMail.getEmailByName("spoorthi");
		System.out.println("Reference of mail is: " + spoorthi);
		
		String sagar = PersonMail.getEmailByName("sagar");
		System.out.println("Reference of mail is: " + sagar);
		
		String kavya = PersonMail.getEmailByName("kavya");
		System.out.println("Reference of mail is: " + kavya);
		
		String shilpa= PersonMail.getEmailByName("shilpa");
		System.out.println("Reference of mail is: " + shilpa);
		
		String roopa = PersonMail.getEmailByName("roopa");
		System.out.println("Reference of mail is: " + roopa);
		
		System.out.println("..............................................................");
		
		String shatabdi=Train.getTrainName(11013);
		System.out.println("the train name is: " +shatabdi);
		String chickmangulr=Train.getTrainName(11014);
		System.out.println("the train name is: " +chickmangulr);
		String bangalore=Train.getTrainName(12134);
		System.out.println("the train name is: " +bangalore);
		String mysore=Train.getTrainName(22691);
		System.out.println("the train name is: " +mysore);
	
}
}
