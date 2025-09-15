class EcommerceRunner
{
	public static void main(String [] ref)
	{
		Ecommerce ecommerce = new Ecommerce();
		 Website name = new Website(23453,"Amazon");
		 Website number = new Website(76578,"eBay");
		 Website names = new Website(34566,"ShopClues");
		 Website num = new Website(56788,"Walmart");
		 Website numbers = new Website(6788,"Myntra");
		 Website[] websites = {name,number,names,num,numbers};
		 ecommerce.ecommerceDetalies(websites);
	}
}