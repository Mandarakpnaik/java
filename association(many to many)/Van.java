class Van
{
	public String vanName;
	public int noOfseats;
	public Seats seat;
	public Tyre tyre;
	public Engine engine;
	public Van(String vanName,int noOfseats,Seats seat,Tyre tyre,Engine engine)
	{
		this.seat=seat;
		this.tyre=tyre;
		this.engine=engine;
		this.noOfseats=noOfseats;
		this.vanName=vanName;
	}
	public void dispalyVanDetails()
	{
		System.out.println("Van name :"+vanName+ ","+ "Number of seats in van :"+noOfseats);
		System.out.println("Seat number :"+seat.seatNumber+ ","+ "Seat is Available :"+seat.isAvailable);
		System.out.println("Tyre brand :"+tyre.brand+ ","+ "Tyre price :"+tyre.price);
		System.out.println("Engine brand :"+engine.brand+ ","+"Engine fule Efficiency :"+engine.fuleEfficiency);
	}
}