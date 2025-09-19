class Phone
{
	public String brand ;
	public double price;
	public Charger charger;
	
	public Phone(String brand,double price,Charger charger)
	{
		this.brand=brand;
		this.price=price;
		this.charger=charger;
	}
	public void displayPhoneDetalies()
	{
		System.out.println("Phone brand is :"+brand+ "," +"Phone price : "+price);
		
		System.out.println("Charger serial Number : "+charger.serialNumber+ "," + "Charger is fast charger : "+charger.isFastCharge);
	}
};