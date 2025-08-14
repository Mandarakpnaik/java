class Percentage
 {
         public static void main(String [] ref)
		 {
			float harshitha = 95.67f;
			float arun = 78.9f;
			float chethana = 90.44f;
			float navya = 77.90f;
			float bhoomika = 67.7f;
			float chandana = 91.5f;
		
			float [] rank = { harshitha,arun,chethana,navya, bhoomika,chandana};
			System.out.println(rank[0]);
			
			float prasad = 82.56f;
			rank[1]=prasad;
			System.out.println(rank[1]);
			
			System.out.println("Percentage of the student");
			for(int marks=0; marks<rank.length; marks++)
		      System.out.println(rank[marks]);
			
			 
		 }
 }