class DressRunner
{
	public static void main(String [] ref)
	{
		Dress dress = new Dress();
		dress.dressType("saree");
		dress.color("red");
		dress.size(30.2f);
		dress.price(2300);
		dress.brand("India");
		
		System.out.println("------------------------------");
		
		Dress value = new Dress();
		value.dressType("Jeans");
		value.color("Blue");
		value.size(34.6f);
		value.price(1000);
		value.brand("China");
		
		System.out.println("------------------------------");
		
		Dress type = new Dress();
		type.dressType("korean Dress");
		type.color("Black");
		type.size(28.2f);
		type.price(35000);
		type.brand("Korean");
		
		System.out.println("------------------------------");
		
		Dress values = new Dress();
		values.dressType("Indian Dress");
		values.color("white");
		values.size(26.4f);
		values.price(5000);
		values.brand("India");
		
		System.out.println("------------------------------");
		
		Dress name = new Dress();
		values.dressType("China dress");
		values.color("Pink");
		values.size(40.4f);
		values.price(10000);
		values.brand("China");
	}
}