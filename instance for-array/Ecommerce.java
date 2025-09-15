class Ecommerce
{
	public void ecommerceDetalies(Website[] website)
	{
		System.out.println(website.length);
		
		for(int value=0;value<website.length;value++)
		{
		  Website values = website[value];
		  values.websiteDetalies();
		}
	}
}