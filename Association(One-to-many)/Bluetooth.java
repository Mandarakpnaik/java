class Bluetooth
{
	public int range;
	public float bluetoothRating;
	public double price;
	public Charger charger;
	
	public Bluetooth(int range,float bluetoothRating,double price,Charger charger)
	{
		this.range=range;
		this.bluetoothRating=bluetoothRating;
		this.price=price;
		this.charger=charger;
	}
	public void displayBluetoothDetalies()
	{
		System.out.println("Bluetooth range :" +range+ "," + "Bluetooth rating :"+bluetoothRating+ "," +"Bluetooth price :"+price);
		System.out.println("Charger serial Number : "+charger.serialNumber+ "," + "Charger is fast charger : "+charger.isFastCharge);
	}
}