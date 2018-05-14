package binarysearchtree;

public class BSTLearn
{
  public static void main(String[] args)
  {
    //Create the empty tree
    BinSrchTree tree = new BinSrchTree();


    //Create 10 people to insert into the tree.
    Person a = new Person("Sue", 48);
    Person b = new Person("Tim", 44);
    Person c = new Person ("Rachel", 22);
    Person d = new Person ("Jim", 18);
    Person e = new Person ("Sid", 18);
    Person f = new Person("Sue", 48);
    Person g = new Person("Tim", 44);
    Person h = new Person ("Rachel", 22);
    Person i = new Person ("Jim", 18);
    Person j = new Person ("Sid", 18);


    //Insert the persons in the tree and display the height as it changes
    tree.insert("A", a);
    System.out.println("The height is: "+tree.height());
    tree.insert("B", b);
    System.out.println("The height is: "+tree.height());
    tree.insert("C", c);
    System.out.println("The height is: "+tree.height());
    tree.insert("D", d);
    System.out.println("The height is: "+tree.height());
    tree.insert("E", e);
    System.out.println("The height is: "+tree.height());
    tree.insert("F", f);
    System.out.println("The height is: "+tree.height());
    tree.insert("G", g);
    System.out.println("The height is: "+tree.height());
    tree.insert("H", h);
    System.out.println("The height is: "+tree.height());
    tree.insert("I", i);
    System.out.println("The height is: "+tree.height());
    tree.insert("J", j);
    System.out.println("The height is: "+tree.height());

    //Display the contents of the tree
    tree.printTree();
    
    //How tall is the tree now?
    System.out.println(tree.height());
  }
}