class Fan extends Appliance
{

public int price;
public String fanName;
public float bladeSize;
public double volatage;
public long serialNumber;
public char energyRating;
public boolean isWorking;

public Fan()
{
System .out.println("this is non arguemental constructor");
}
public Fan(int price,String fanName,float bladeSize,double volatage,long serialNumber,char energyRating,boolean isWorking){

super();
this.price=price;
this.fanName=fanName;
this.bladeSize=bladeSize;
this.volatage=volatage;
this.serialNumber=serialNumber;
this.energyRating=energyRating;
this.isWorking=isWorking;

super.price=price;
super.fanName=fanName;
super.bladeSize=bladeSize;
super.volatage=volatage;
super.serialNumber=serialNumber;
super.energyRating=energyRating;
super.isWorking=isWorking;

}
public void displayFan(){

System.out.println("fan price :"+this.price);
System.out.println("fan name :"+this.fanName);
System.out.println("blade size :"+this.bladeSize);
System.out.println("volatage :"+this.volatage);
System.out.println("serialNumber :"+this.serialNumber);
System.out.println("energyRating :"+this.energyRating);
System.out.println("isWorking :"+this.isWorking);

System.out.println(super.price);
System.out.println(super.fanName);
System.out.println(super.bladeSize);
System.out.println(super.volatage);
System.out.println(super.serialNumber);
System.out.println(super.energyRating);
System.out.println(super.isWorking);


}
}