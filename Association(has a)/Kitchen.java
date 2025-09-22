class Kitchen
{
	public boolean isOpen;
	public int noOfPlates;
	public MixerGrinder grinder;
	public Jars jars;
	public Glass glass;
	public Kitchen(boolean isOpen,int noOfPlates,MixerGrinder grinder,Jars jars,Glass glass)
	{
		this.isOpen=isOpen;
		this.noOfPlates=noOfPlates;
		this.glass=glass;
		this.grinder=grinder;
		this.jars=jars;
	}
	public void displayKitchenDetails()
	
	{
		System.out.println("Kitchen is Open :"+isOpen+ ","+ "Number of Plates :"+noOfPlates);
		System.out.println("MixerGrinder Brand name :"+grinder.brandName+ ","+ "MixerGrinder price :"+grinder.price);
		System.out.println("Jars materical is Steel :"+jars.materical+ ","+ "Jars volume :"+jars.volume);
		System.out.println("Glass price :"+glass.price+ ","+ "Glass brand Name :"+glass.brandName);
	}
}