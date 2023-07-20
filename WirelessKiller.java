class WirelessKiller{
	public static void main(String[] args){
		System.out.println("running main in the WirelessKiller");
		WirelessController controller1=new WirelessController();
		System.out.println(controller1.battery);
		System.out.println(controller1.technology);
		System.out.println(controller1.inputControl);
		System.out.println(controller1.compatability);
		System.out.println(controller1.function);
		controller1.battery="Rechargeable";
		controller1.technology="WI_FI";
		controller1.inputControl="Button";
		controller1.compatability="PCs";
		controller1.function="jumping";
		
		System.out.println("=======================");
		System.out.println(controller1.battery);
		System.out.println(controller1.technology);
		System.out.println(controller1.inputControl);
		System.out.println(controller1.compatability);
		System.out.println(controller1.function);
		
		System.out.println("==========Controller-2=============");
		WirelessController controller2=new WirelessController();
		System.out.println(controller2.battery);
		System.out.println(controller2.technology);
		System.out.println(controller2.inputControl);
		System.out.println(controller2.compatability);
		System.out.println(controller2.function);
		controller2.battery="not-Rechargeable";
		controller2.technology="Bluetooth";
		controller2.inputControl="trigger";
		controller2.compatability="Mobile-devices";
		controller2.function="shooting";
		
		System.out.println("=======================");
		System.out.println(controller2.battery);
		System.out.println(controller2.technology);
		System.out.println(controller2.inputControl);
		System.out.println(controller2.compatability);
		System.out.println(controller2.function);
	}
}