class Laptops
{
	public boolean isGaming;
	public String laptopBrand;
	public Charger charger;
	
	public Laptops(boolean isGaming,String laptopBrand,Charger charger)
	{
		this.isGaming=isGaming;
		this.laptopBrand=laptopBrand;
		this.charger=charger;
		
	}
	public void displayLaptopDetalies()
	{
		
		System.out.println("Laptops is gaming :"+isGaming+ "," + "Laptop brand :"+laptopBrand);
		
		System.out.println("Charger serial Number : "+charger.serialNumber+ "," + "Charger is fast charger : "+charger.isFastCharge);
	}
}