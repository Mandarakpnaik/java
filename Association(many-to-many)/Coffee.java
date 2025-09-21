class Coffee
{
	public String coffeeName;
    public boolean isTasty;
	public Sugar sugar;
	public Milk milk;
	public Ice ice;
	public Coffee(String coffeeName,boolean isTasty,Sugar sugar,Milk milk,Ice ice)
	{
     this.sugar=sugar;
	 this.milk=milk;
	 this.ice=ice;
     this.coffeeName=coffeeName;
     this.isTasty=isTasty;
     
    }
    public void displayCoffeeDetails()
	{

     System.out.println("coffee name="+coffeeName+","+"is tasty="+isTasty);
	 System.out.println("Number of Spoons sugar :"+sugar.noOfSpoons+ ","+ "Sugar Less :"+sugar.isSugarLess);
	 System.out.println("Milk price :"+milk.price+ ","+ "Milk is fresh :"+milk.isFresh);
	 System.out.println("Ice brand :"+ice.brand+ ","+"Ice is Frozen :"+ice.isFrozen);
    }
}