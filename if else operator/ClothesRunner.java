class ClothesRunner
{
	public static void main(String [] ref)
	{
		int number = Clothes.price("top",30);
		System.out.println(number);
		
		System.out.println("---------------");
		
		int code = Clothes.clotheColor("black",90);
		System.out.println(code);
		System.out.println("---------------");
		
		int num = Clothes.fabricNumber("cotton",90);
		System.out.println(num);
		
		System.out.println("---------------");
		
		int size = Clothes.clotheSize("green",85);
		System.out.println(size);
		System.out.println("---------------");
		
		int stock = Clothes.clotheStock("top",100);
		System.out.println(stock);
		System.out.println("---------------");
		
		int numbers = Clothes.discount("fullDress",1500);
		System.out.println(numbers);
		System.out.println("---------------");
		
		int month = Clothes.season("summer",4);
		System.out.println(month);
		System.out.println("---------------");
		
		int codes = Clothes.washingType("Jeans",10);
		System.out.println(codes);
		System.out.println("---------------");
		
		int year = Clothes.trend("jeans",2024);
		System.out.println(year);
		System.out.println("---------------");
		
		int  gender = Clothes.gender("jeans",'M');
		System.out.println(gender);
		System.out.println("---------------");
		
		int  price = Clothes.clothePrice("jeansTop",800);
		System.out.println(price);
		System.out.println("---------------");
		

		
		int  length = Clothes.sleeve("top",10);
		System.out.println(length);
		System.out.println("---------------");
		
		
		int  rating = Clothes.clotheBrand("sitha",5);
		System.out.println(rating);
		System.out.println("---------------");
		
		
		int months  = Clothes.festivalOffer("Diwali",9);
		System.out.println(months);
		System.out.println("---------------");
		
		
		int  order = Clothes.onlineOrder("Dress",6);
		System.out.println(order);
		
		
		
	}
}