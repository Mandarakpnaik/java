class Gold
{
public static int weight;
public static long price;
public static char quality;
public static float purity;
public static double marketValue;
public static boolean isPure ;
public static String origin;

public static void gold()
{
 System.out.println("Before init weight of gold="+weight);
 weight = 100;
 System.out.println("After init weight of gold="+weight);
 
 System.out.println("---------------------------");
 
 System.out.println("Before init price of gold = "+price);
 price = 680000l;
 System.out.println("After init price of gold = "+price);
 
 System.out.println("---------------------------");
 
 System.out.println("Before init quality of gold = "+quality);
 quality = 'A';
 System.out.println("After init quality of gold ="+quality);
 
 System.out.println("---------------------------");
 
 System.out.println("Before init purity of gold = "+purity);
 purity = 76.5f;
 System.out.println("After init purity of gold =" +purity);
 
 System.out.println("-----------------------------");
 
 System.out.println("Before init market value of gold = "+marketValue);
 marketValue = 6744456.876;
 System.out.println("After init market value of gold = "+marketValue);
 
 System.out.println("-------------------------------");
 
 System.out.println("Before init gold is pure ="+isPure);
 isPure = false;
 System.out.println("After init gold is pure ="+isPure);
 
 System.out.println("-------------------------------");
 
 System.out.println("Before init origin place = "+origin);
 origin = "china";
 System.out.println("After init origin place = "+origin);
 }
}