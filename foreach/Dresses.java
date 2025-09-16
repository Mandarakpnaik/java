class Dresses
{
	public String dressName;
	public boolean isAvailable;
	
	public Dresses(String name,boolean available)
	{
		dressName=name;
		isAvailable=available;
	}
	public void dressDetails()
	{
		System.out.println("Dress name :"+dressName+","+"Available :"+isAvailable);
	}
}