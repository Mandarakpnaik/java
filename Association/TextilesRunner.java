class TextilesRunner
{
	public static void main(String [] ref)
	{
		Clothes clothes = new Clothes("Jeans");
		Textiles textiles =new Textiles(clothes);
		System.out.println(textiles.name);
	}
}