class HouseRunner
{
	public static void main(String [] ref)
	{
		Chair chair =new Chair(500,true);
		Table table = new Table(4,120.3f);
		Sofa sofa=new Sofa(2500,"Brown");
		
		House house=new House("Gowri House",500000,chair,table,sofa);
		
		house.displayHouseDetails();
	}
}