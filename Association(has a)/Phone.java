class Phone
{
	public String phoneName;
	public int price;
	public Charger charger;
	
	public Phone(String phoneName,int price,Charger charger)
	{
		this.phoneName=phoneName;
		this.price=price;
		this.charger=charger;
	}
	public void displayPhoneDetails()
	{
		System.out.println("Phone name :"+phoneName+ ","+ "Phone price :"+price+ ","+ "Charger price :"+charger.price);
	}
}