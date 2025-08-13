class DeskRunner
{
public static void main(String [] ref)
{
	int orders = Desk.numberOfOrders();
	
	System.out.println(orders);
	
	int student = Desk.numberOfStudents();
	System.out.println(student);
	
	int number = Desk.deskNumber();
	
	System.out.println(number);
	
	int desks = Desk.numberOfDesks();
	System.out.println(desks);
	
	int school = Desk.totalDeskInSchool();
	System.out.println(school);

	
}

}