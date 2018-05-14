package binarysearchtree;

public class BSTLearn
{
  public static void main(String[] args)
  {
    //Create the empty tree
    BinSrchTree SearchTree = new BinSrchTree();


    //Create some person objects to put in the tree
    Person sue = new Person("Sue", 48);
    Person tim = new Person("Tim", 44);
    Person rachel = new Person ("Rachel", 22);
    Person jim = new Person ("Jim", 18);
    Person sid = new Person ("Sid", 18);

    //Insert the persons in the tree and display the depth as it changes
    SearchTree.insert("B", sue);
    System.out.println("The depth is: "+SearchTree.depth());
    SearchTree.insert("A", tim);
    System.out.println("The depth is: "+SearchTree.depth());
    SearchTree.insert("C", rachel);
    System.out.println("The depth is: "+SearchTree.depth());
    SearchTree.insert("V", jim);
    SearchTree.insert("Z", sid);

    //Display the contents of the tree
    SearchTree.printTree();
    //How tall is the tree now?
    System.out.println(SearchTree.depth());


    String key = "V";
    Person p = (Person) SearchTree.search(key);
    System.out.println("expect:\tJim");
    System.out.println("got:\t"+p.getName());

    key = "E";
    p = (Person) SearchTree.search(key);
    System.out.println("expect:\ttrue");
    System.out.println("got:\t"+(p==null));

    key = "E";
    SearchTree.delete(key);
    System.out.println("expect:\tABCVZ");
    System.out.println("got:\t"+SearchTree);

    key = "V";
    SearchTree.delete(key);
    System.out.println("expect:\tABCZ");
    System.out.println("got:\t"+SearchTree);

    key = "B";
    SearchTree.delete(key);
    System.out.println("expect:\tACZ");
    System.out.println("got:\t"+SearchTree);

  } // main method
}