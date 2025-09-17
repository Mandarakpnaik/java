class Dosa
{
	public String name;
	public Chatuney chatuney;
	public Dosa(Chatuney chatuney)
	{
		this.name = chatuney.name;
		this.chatuney=chatuney;
	}
	public void displayDosa()
	{
		chatuney.displayChatuney();
	}
}