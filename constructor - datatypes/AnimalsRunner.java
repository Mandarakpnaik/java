class AnimalsRunner
{
public static void main(String [] args)
    {
      new Animals(3);
      new Animals(8,"lion");
      new Animals(9,"lion",true);
      new Animals(2,"lion",true,3356665l);
      new Animals(3,"lion",43536l,'A',true);
      new Animals("lion");
      new Animals("lion",3);
      new Animals(5,"lion",'A',true,3354l);
    }
}