class VegetableRunner
{
public static void main(String [] ref)
{
int number = Vegetable.numberOfVegetable(7);
System.out.println(number);

String name = Vegetable.nameOfVegetable("tomato");
System.out.println(name);

long phoneNumber = Vegetable.sellerPhoneNumber(8976545678l);
System.out.println(phoneNumber);

float rating = Vegetable.vegetableRating(4.1f);
System.out.println(rating);

double cost = Vegetable.shopCost(5785.67);
System.out.println(cost);

boolean good = Vegetable.isGood(true);
System.out.println(good);

char grade = Vegetable.vegetableGrade('B');
System.out.println(grade);


}
}