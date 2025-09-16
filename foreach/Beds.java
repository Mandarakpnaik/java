class Beds
{
	public int numberOfBed;
	public double bedPrice;
	
	public Beds(int numberOfBed,double bedPrice)
	{
		this.numberOfBed=numberOfBed;
		this.bedPrice=bedPrice;
	}
	public void bedDetails()
	{
		System.out.println("Number of bed :"+numberOfBed+" ,"+"Bed price :"+bedPrice);
	}
}