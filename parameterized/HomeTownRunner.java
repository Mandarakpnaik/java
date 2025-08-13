class HomeTownRunner
{
public static void main(String [] ref)
{
int number = HomeTown.numberOfPopulation(2378);
System.out.println(number);

String name = HomeTown.homeTownName("village");
System.out.println(name);

long total= HomeTown.totalTravelers(8967l);
System.out.println(total);

float rating = HomeTown.literacyRating(3.9f);
System.out.println(rating);

double size = HomeTown.totalSize(457.678);
System.out.println(size);

boolean place= HomeTown.isTouristPlace(true);
System.out.println(place);

char grade =  HomeTown.homeTownGrade('A');
System.out.println(grade);


}
}