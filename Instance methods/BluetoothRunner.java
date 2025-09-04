class BluetoothRunner
{
	public static void main(String [] ref)
	{
		Bluetooth bluetooth = new Bluetooth();
		bluetooth.deviceName("Jbl Speaker");
		bluetooth.version(5.0f);
		bluetooth.range(10);
		bluetooth.status(true);
		bluetooth.connectedDeviceName("Redmi 12");
		
		System.out.println("-------------------------------");
		
		Bluetooth blue = new Bluetooth();
		blue.deviceName("CORE-NB3 JoyPods");
		blue.version(4.9f);
		blue.range(40);
		blue.status(false);
		blue.connectedDeviceName("Vivo ");
		
		System.out.println("-------------------------------");
		
		Bluetooth name = new Bluetooth();
		name.deviceName("FPods FX100");
		name.version(4.8f);
		name.range(59);
		name.status(true);
		name.connectedDeviceName("HP Laptops Window11");
		
		System.out.println("-------------------------------");
		
		Bluetooth value = new Bluetooth();
		value.deviceName("BeatBrain");
		value.version(4.6f);
		value.range(100);
		value.status(true);
		value.connectedDeviceName("Xiaomi");
		System.out.println("-------------------------------");
		
		Bluetooth values = new Bluetooth();
		values.deviceName("Sony Pods");
		values.version(4.5f);
		values.range(80);
		values.status(false);
		values.connectedDeviceName("OPPO");
		
	}
}