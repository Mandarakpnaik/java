class BuildingRunner
{
	public static void main(String [] ref)
	{
		Building building = new Building();
		building.noOfFloors(6);
		building.buildingLocation("Yelahanka");
		building.buildingName("Kirshna nilaya");
		building.price(35000);
		building.ownerName("Arun Kumar");
		
		System.out.println("------------------------------");
		
		Building num = new Building();
		num.noOfFloors(5);
		num.buildingLocation("Bangalore");
		num.buildingName("RamKrishna");
		num.price(40000);
		num.ownerName("Radha");
		System.out.println("------------------------------");
		
		Building loc = new Building();
		loc.noOfFloors(3);
		loc.buildingLocation("devanahalli");
		loc.buildingName("ramyaVikas");
		loc.price(14000);
		loc.ownerName("Vikas");
		System.out.println("------------------------------");
		
		Building name = new Building();
		name.noOfFloors(2);
		name.buildingLocation("ballari");
		name.buildingName("Aviraj");
		name.price(25000);
		name.ownerName("Raj");
		System.out.println("------------------------------");
		
		Building price = new Building();
		price.noOfFloors(10);
		price.buildingLocation("bangalore");
		price.buildingName("rakesh house");
		price.price(50000);
		price.ownerName("Rakii");
		
		
		
	}
}