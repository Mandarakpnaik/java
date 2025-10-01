class TransportRunner
{
	public static void main(String [] ref)
	{
		Seats seats = new Seats(5,true);
		Seats seat = new Seats(10,true);
		Seats num = new Seats(4,false);
		
		Tyre tyre = new Tyre(2500,"Jk Tyres");
		Tyre tyres = new Tyre(5000,"CEAT");
		
		Engine engine = new Engine("Honda",7.8f);
		Engine engines= new Engine("Tata",8.34f);
		
		Bus bus = new Bus("vijayanagar to majestic",56789l,seat,tyre,engine);
		Car car = new Car(4,560342.345,seats,tyres,engines);
		Van van = new Van("Passenger van",20,num,tyres,engine);
		
		bus.displayBusDetails();
		System.out.println("----------------------------------------------------");
		car.displayCarDeatils();
		System.out.println("----------------------------------------------------");
		van.dispalyVanDetails();
	}
}