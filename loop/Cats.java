class Cats
      {
           public static void main(String [] ref)
		   {
			 byte luna = 5;
             byte simba = 7;
			 byte bella = 3;
			 
		   byte [] age ={luna,simba,bella};
			 System.out.println(age[2]);
			 
			 byte smokey = 10;
			 age[0]= smokey;
			 System.out.println(age[0]);
			 
			 System.out.println( "age of the cats");
			 for(int number=0;  number<age.length; number++)
			  System.out.println(age[number]);
		  
			 
		   }
      }