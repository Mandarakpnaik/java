class Refrigerator
{
	public Refrigerator()
	{
		this("Sumsung");
	}
	public Refrigerator(String brand)
	{
		this("Sumsung",25000);
		System.out.println(brand);
	}
	public Refrigerator(String brand,int price)
	{
		this("Sumsung",35000,67193059859l);
		System.out.println(brand+ "," +price);
	}
	public Refrigerator(String brand,int price,long serialNumber)
	{
		this("Sumsung",30000,12455059859l,1.2f);
		System.out.println(brand+","+price+ ","+serialNumber);
		
	}
	public Refrigerator(String brand,int price,long serialNumber,float powerRating)
	{
		this("Sumsung",18000,98765059859l,2.2f,10.00);
		System.out.println(brand+"," +price+ ","+serialNumber+"," +powerRating);
	}
	public Refrigerator(String brand,int price,long serialNumber,float powerRating,double warranry)
	{
		this("Sumsung",18000,98765059859l,1.2f,11.45,'A');
		System.out.println(brand+ ","+price+"," +serialNumber+ ","+powerRating+"," +warranry);
	}
	public Refrigerator(String brand,int price,long serialNumber,float powerRating,double warranry,char energyGrade)
	{
		this("Sumsung",18000,98765059859l,1.2f,11.45,'A',true);
		System.out.println(brand+ ","+price+"," +serialNumber+ ","+powerRating+ "," +warranry+","  +energyGrade);
	}
	public Refrigerator(String brand,int price,long serialNumber,float powerRating,double warranry,char energyGrade,boolean isFrostFree)
	{
		System.out.println(brand+"," +price+"," +serialNumber+ ","+powerRating+ "," +warranry+ "," +energyGrade+ ","+isFrostFree);
	}
}