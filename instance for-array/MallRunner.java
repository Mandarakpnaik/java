class MallRunner
{
	public static void main(String [] ref)
	{
		Mall mall = new Mall();
		Shops num = new Shops(10,"Chicco");
		Shops value = new Shops(15,"Soch");
		Shops number = new Shops(18,"Jack and Jones");
		Shops values = new Shops(20,"Van Heusen");
		
		Shops[] shop ={num,value,number,values};
		mall.noOfMalls(shop);
	}
}