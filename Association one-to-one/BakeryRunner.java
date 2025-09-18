class BakeryRunner
{
	public static void main(String [] ref)
	{
		Items item = new Items("Cake",250);
		Bakery bakery = new Bakery("Vanilla Valley",4.7f,item);
		bakery.bakeryDetailes();
	}
}