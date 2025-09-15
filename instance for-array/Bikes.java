class Bikes
{
public String bikeName ;
public boolean isGoodCondition ;

public Bikes(String bikeName,boolean isGoodCondition)
{
	this.bikeName = bikeName;
	this.isGoodCondition = isGoodCondition;
}
public void displayBikes()
{
	System.out.println("name :"+bikeName);
	System.out.println("condition :"+isGoodCondition);
}
}