class TreeDetails
{
 public static void branches()
 {
    System.out.println("Branches of the tree");
 }
 public static void leaves()
 {
	 System.out.println("Leaves of the tree");
	 branches();
	 
 }
 public static void appleTree()
 {
	 System.out.println("Tree name is apple");
	 leaves();
 }
}