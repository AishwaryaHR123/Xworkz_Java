class Engine{
	static String getCCByModel(String CCByModel){
System.out.println("invoking the getCCByModel by engine");

if(CCByModel!=null){
	
	if("1197cc"==CCByModel){
		
		return "swift";
	}
	if("1498cc"==CCByModel){
		
		return "rapid";
		
	}
	if("2998cc"==CCByModel){

		return "bmw";
	}
	if("1993cc"==CCByModel){
	return "benz";
	}
	if("1197cc"==CCByModel){	
	return "audi";
	}
	if("1198cc"==CCByModel){
		return "bently";
	}
}
	else{
		System.out.println("Given cc is not valid");
	}
	return "engine";
	}
}