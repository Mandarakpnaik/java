class Mobile
{
	public boolean isGoodCondition;
	public Charger charger;
	
	public Mobile(Charger charger)
	{
		this.charger=charger;
		this.isGoodCondition=charger.isGoodCondition;
	}
}