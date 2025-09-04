class Bluetooth
{
	public void deviceName(String name)
	{
		System.out.println("Device Name :"+name);
	}
	public void version(float version)
	{
		System.out.println("Bluetooth  Version:"+version);
	}
	public void range(int range)
	{
		System.out.println("Bluetooth range in meters:"+range);
	}
	public void status(boolean status)
	{
		System.out.println("Bluetooth is connectes:"+status);
	}
	public void connectedDeviceName(String name)
	{
		System.out.println("The bluetooth connected Device Name is :"+name);
	}
}