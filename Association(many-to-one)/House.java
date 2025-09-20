class House
{
	public String houseName;
	public int housePrice;
	public Chair chair;
	public Table table;
	public Sofa sofa;
	
	public House(String houseName,int housePrice,Chair chair,Table table,Sofa sofa)
	{
		this.houseName=houseName;
		this.housePrice=housePrice;
		this.chair=chair;
		this.table=table;
		this.sofa=sofa;
	}
	public void displayHouseDetails()
	{
		System.out.println("House name :"+houseName+ "," +"House price :"+housePrice);
		System.out.println("Chair price :"+chair.price+ "," +"Chair is wooden :"+chair.isWooden);
		System.out.println("Table legs :"+table.legs+ ","+ "Table length :"+table.length);
		System.out.println("Sofa price :"+sofa.price+ ","+ "Sofa color :"+sofa.color);
	}
}