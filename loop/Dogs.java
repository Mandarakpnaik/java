class Dogs
 {
         public static void main(String [] ref)
		 {
			 int charlie = 15000;
			 int  leo   = 12000;
			 int max  =   18000;
			 int rosie = 17000;
			 int coco = 10000;
			 
			 int [] cost = {charlie,leo,max,rosie,coco};
			 System.out.println(cost[3]);
			 
			 int lucy = 9000;
			 cost[2]= lucy;
			 System.out.println(cost[2]);
			 
			 System.out.println("price of the dogs");
			 for(int price=0; price<cost.length; price++)
			 System.out.println(cost[price]);
				 
		 }
}