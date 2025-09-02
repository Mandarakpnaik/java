class FlowerRunner
{
	public static void main(String [] ref)
	{
		new Flower(5);
		new Flower("Rose",5);
		new Flower(5,"Rose",'A');
		new Flower(false,1.3f,150.343);
		new Flower(0.6f,200.54,true,"rose");
		new Flower('R',1234567l,5,"rose",false);
		new Flower(876512l,'R',7.5f,6,"Rose",false);
		new Flower(200.876,false,87676546l,'R',1.5f,6,"rose");
	}
}