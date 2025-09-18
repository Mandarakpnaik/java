class Bakery
{
	public String bakeryName;
	public float rating;
	public Items value;
	
	public Bakery(String bakeryName,float rating,Items value)
	{
		this.bakeryName=bakeryName;
		this.rating=rating;
		this.value=value;
	}
	public void bakeryDetailes()
	{
		System.out.println("Bakery name :"+bakeryName+ ","+"Bakery rating :"+rating);
		System.out.println("Item name :"+value.itemName+ "," +"Item price :"+value.price);
		
	}
}