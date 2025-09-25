class Device extends ElectronicDevice
{
	public String brandName ;
	public int price;
	public char type;
	public float screenSize;
	public double weight;
	public long serialNumber ;
	public boolean isSamartDevice;
	
	public Device()
	{
		System.out.println("Device class  no-argument const");
	}
	public Device(String brandName,int price,char type,float screenSize,double weight,long serialNumber,boolean isSamartDevice)
	{    
	    super();
		this.brandName=brandName;
		this.price=price;
		this.type=type;
		this.screenSize=screenSize;
		this.serialNumber=serialNumber;
		this.isSamartDevice=isSamartDevice;
		this.weight=weight;
	}
	public void displayDevice()
	{
	System.out.println("Device brandName " +this.brandName);
	System.out.println(super.brandName);
	System.out.println("Device price" +this.price);
	System.out.println(super.price);
	System.out.println("Device type "+this.type);
	System.out.println(super.type);
	System.out.println("Device screen Size "+this.screenSize);
	System.out.println(super.screenSize);
	System.out.println("Device serialNumber "+this.serialNumber);
	System.out.println(super.serialNumber);
	System.out.println("Device isSamart Device "+this.isSamartDevice);
	System.out.println(super.isSamartDevice);
	System.out.println("Device weight "+this.weight);
	System.out.println(super.weight);
	}
}