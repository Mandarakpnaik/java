class Table
     {
		 public static void main(String [] ref)
		 {
			 short foodTable = 490;
			 short glassTable = 899;
			 short workTable = 636;
			 short coffeeTable = 367;
			 
			 short [] quality = {foodTable, glassTable, workTable, coffeeTable};
			 System.out.println(quality[2]);
			 
			 short computerTable = 978;
			 quality[3]=computerTable;
			 System.out.println(quality[3]);
			 
			 System.out.println("price of the tables");
			 for(int price=0; price<quality.length; price++)
				 System.out.println(quality[price]);
		
		 }
}