class Tablet
{
	public String brand;
	public double price;
	public Charger charger;
	
	public Tablet(String brand,double price,Charger charger)
	{
		this.brand=brand;
		this.price=price;
		this.charger=charger;
	}
	public void displayTablerDetalies()
	{
		System.out.println("Tablet brand :"+brand+ ","+ "price :"+price);
		System.out.println("Charger serial Number : "+charger.serialNumber+ "," + "Charger is fast charger : "+charger.isFastCharge);
	}
}