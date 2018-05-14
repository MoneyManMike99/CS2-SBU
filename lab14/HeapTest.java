package heap;

import java.io.*;

public class HeapTest
{
  public static void main(String [] args)
  {
    //Create the heap
    Heap h = new Heap();

    //Insert some items
    h.insert(new Integer(5),5);
    h.insert(new Integer(3),3);
    h.insert(new Integer(7),7);
    h.insert(new Integer(1),1);
    h.insert(new Integer(6),6);
    h.insert(new Integer(2),2);
    h.insert(new Integer(10),10);

    System.out.println("Here is the heap: "+ h);

    System.out.println("getting ready to deplete the tree");

/*
    while (!h.isEmpty())
    {
        HeapNode node = (HeapNode) h.remove();
        System.out.println(node.getPriority());
    }
*/
  }
}
