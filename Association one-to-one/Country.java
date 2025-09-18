class Country
{
	public long population;
	public String countryName;
	public States number;
	public Country(long population,String countryName,States number)
	{
		this.population=population;
		this.countryName=countryName;
		this.number=number;
		
	}
	public void displayCountryDetailes()
	{
		System.out.println("Country name :"+countryName+ "," +"Country population :"+population);
		System.out.println("States name  :"+number.stateName+ " , "+ "States population :"+number.population);
	}
}