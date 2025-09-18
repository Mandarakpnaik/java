class CountryRunner
{
	public static void main(String [] ref)
	{
		States state = new States("Karnataka",657897856l);
		Country country = new Country(987690456734l,"India",state);
		country.displayCountryDetailes();
	}
}