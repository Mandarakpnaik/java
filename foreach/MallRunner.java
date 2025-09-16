class MallRunner
{
	public static void main(String [] ref)
	{
		Mall mall = new Mall();
		Dresses dressName = new Dresses("T-shirt dress",true);
		Dresses name = new Dresses("Wrap dress",false);
		Dresses names = new Dresses("Bodycon dress",false);
		Dresses numberOfDress = new Dresses("Indian wear",true);
		Dresses[] dresses = {dressName,name,names,numberOfDress};
		mall.mallDetails(dresses);
	}
}