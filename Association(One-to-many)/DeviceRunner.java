class DeviceRunner
{
	public static void main(String [] ref)
	{
		Charger charger = new Charger(12345690l,true);
		Charger cable = new Charger(23456965l,true);
		Charger wire = new Charger(546789l,false);
		Charger cables = new Charger(897655444l,true);
		
		Phone phone = new Phone("Redmi 12",1505.60,charger);
		Laptops laptop = new Laptops(true ,"Dell",cable);
		Bluetooth bluetooth = new Bluetooth(10,4.3f,2508.900,wire);
		SmartWatch smartWatch = new SmartWatch(false,"Apple watch",2023,cables);
		Tablet tab = new Tablet("Apple iPad",9000.567,wire);
		
		phone.displayPhoneDetalies();
		System.out.println("----------------------------------------------");
		
		laptop.displayLaptopDetalies();
		System.out.println("----------------------------------------------");
		
		bluetooth.displayBluetoothDetalies();
		System.out.println("----------------------------------------------");
		
		tab.displayTablerDetalies();
		System.out.println("----------------------------------------------");
		
		smartWatch.displaySmartWatchDetalies();
		
	}
}