class ShopsRunner
{
	public static void main(String [] ref)
	{
		Shops shop = new Shops();
		Beds bedName = new Beds(2,3000.23);
		Beds name = new Beds(10,10300.34);
		Beds NumberOfBeds = new Beds(6,4500.34);
		Beds bedNumber = new Beds(4,3600.455);
		
		Beds[] bed ={bedName,name,NumberOfBeds,bedNumber};
		shop.shopsDetails(bed);
	}
}