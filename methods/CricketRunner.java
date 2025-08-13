class CricketRunner
{
public static void main(String [] ref)
{
	int  number =Cricket.cricketNumber();
	
	System.out.println(number);
	
	int cost = Cricket.playerCost();
	System.out.println(cost);
	
	int player = Cricket.totalPlayer();
	System.out.println(player);
	
	int over = Cricket.totalOver();
	System.out.println(over);
	
	int balls = Cricket.numberOfBalls();
	System.out.println(balls);

	
}

}