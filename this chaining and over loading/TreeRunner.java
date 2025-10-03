class TreeRunner
{
	public static void main(String [] ref)
	{
		Tree tree = new Tree();
		tree.displayTree(30000);
		tree.displayTree(30000,"Mango tree");
		tree.displayTree(30000,"Mango tree",10021887751l);
		tree.displayTree(30000,"Mango tree",10021887751l,50.44f);
		tree.displayTree(30000,"Mango tree",10021887751l,50.44f,1200.34);
		tree.displayTree(30000,"Mango tree",10021887751l,50.44f,1200.34,'F');
		tree.displayTree(30000,"Mango tree",10021887751l,50.44f,1200.34,'F',true);
	}
}