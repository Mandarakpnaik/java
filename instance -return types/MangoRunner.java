class MangoRunner
{
	public static void main(String [] ref)
	{
		Mango mango = new Mango();
		int price =mango.displayPrice();
		System.out.println(price);
		char grade=mango.displayGrade();
		System.out.println(grade);
	    boolean organic =mango.displayOrganic();
		System.out.println(organic);
	    long total=mango.displayTotal();
		System.out.println(total);
	    float sweet = mango.displaySweetness();
		System.out.println(sweet);
	    double vitamin= mango.displayVitamin();
		System.out.println(vitamin);
	    String variety= mango.displayVariety();
		System.out.println(variety);
	}
}