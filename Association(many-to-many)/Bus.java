class Bus
{
	public String route;
	public long totalTrips;
	public Seats seat;
	public Tyre tyre;
	public Engine engine;
	
	public Bus(String route,long totalTrips,Seats seat,Tyre tyre,Engine engine)
	{
		this.route=route;
		this.totalTrips=totalTrips;
		this.seat=seat;
		this.tyre=tyre;
		this.engine=engine;
	}
	public void displayBusDetails()
	{
		System.out.println("Bus route :"+route+ ","+ "Bus total Trips :"+totalTrips);
		System.out.println("Seat number :"+seat.seatNumber+ ","+ "Seat is Available :"+seat.isAvailable);
		System.out.println("Tyre brand :"+tyre.brand+ ","+ "Tyre price :"+tyre.price);
		System.out.println("Engine brand :"+engine.brand+ ","+"Engine fule Efficiency :"+engine.fuleEfficiency);
	}
}