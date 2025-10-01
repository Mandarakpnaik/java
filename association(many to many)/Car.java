class Car
{
	public int doors;
	public double price;
    public Seats seat;
	public Tyre tyre;
	public Engine engine;
	public Car(int doors,double price,Seats seat,Tyre tyre,Engine engine)
	
	{
		this.doors=doors;
		this.price=price;
		this.seat=seat;
		this.tyre=tyre;
		this.engine=engine;
		
	}
	public void displayCarDeatils()
	{
		System.out.println("Car doors :"+doors+ ","+ "Car price :"+price);
		System.out.println("Seat number :"+seat.seatNumber+ ","+ "Seat is Available :"+seat.isAvailable);
		System.out.println("Tyre brand :"+tyre.brand+ ","+ "Tyre price :"+tyre.price);
		System.out.println("Engine brand :"+engine.brand+ ","+"Engine fule Efficiency :"+engine.fuleEfficiency);
	}
}