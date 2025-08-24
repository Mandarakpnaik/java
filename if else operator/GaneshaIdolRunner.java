class GaneshaIdolRunner
{
	public static void main(String [] ref)
	{
		int amount = GaneshaIdol.price("oneInch",1000);
		System.out.println(amount);
		System.out.println("---------------");
		
		
		int price =GaneshaIdol.amount("twoInc",3000);
		System.out.println(price);
		System.out.println("---------------");
		
		
		int stock = GaneshaIdol.idolAvailability("ganes",10);
		System.out.println(stock);
		System.out.println("---------------");
		
		
		 int num = GaneshaIdol.delivery(44.56,6);
		 System.out.println(num);
		 System.out.println("---------------");
		
		  
		 int hours = GaneshaIdol.transport("bik",3);
		 System.out.println(hours);
		 System.out.println("---------------");
		
		  
		  
		 int ligth = GaneshaIdol.numberOfLigth("red",1);
		 System.out.println(ligth);
		 System.out.println("---------------");
		
		  
		 int idol = GaneshaIdol.numberOfIdol("Gold",35);
		 System.out.println(idol);
		 System.out.println("---------------");
		
		  
		 int heigth = GaneshaIdol.idolHeigth("smallGwori",2);
		 System.out.println(heigth);
		 System.out.println("---------------");
		
		  
		 int codes = GaneshaIdol.material("clay",200);
		 System.out.println(codes);
		 System.out.println("---------------");
		
		  
		 int code = GaneshaIdol.color("whit",8);
		 System.out.println(code);
		 System.out.println("---------------");
		
		  
		 int amounts = GaneshaIdol.discount("smallGanesha",1000);
		 System.out.println(amounts);
		 System.out.println("---------------");
		
		  
		 int distance = GaneshaIdol.shipping("bangalore",30);
		 System.out.println(distance);
		 System.out.println("---------------");
		
		  
		  int cod = GaneshaIdol.idolTypes("sitting",1000);
		  System.out.println(cod);
		  
		  int month = GaneshaIdol.festival("ganesha",9);
		  System.out.println(month);
		  
		 int Amount= GaneshaIdol.payment("UPi",700);
		 System.out.println(Amount);
		 System.out.println("---------------");
		
		  
		  int rate = GaneshaIdol.rating("UPi",5);
		  System.out.println(rate);
		  System.out.println("---------------");
		
		  
		  int weight = GaneshaIdol.export("idol",33);
		  System.out.println(weight);
		  System.out.println("---------------");
		
		  
		 int choice = GaneshaIdol.customization("unique",2);
		 System.out.println(choice);
		 System.out.println("---------------");
		
		  
		 int policy= GaneshaIdol.returnPolicy("Gwor",2);
		  System.out.println(policy);
		 System.out.println("---------------");
		
		  
		 int number = GaneshaIdol.packageNumber("Gwori",91);
		 System.out.println(number);
		  
		
	}
}