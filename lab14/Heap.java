package heap;

public class Heap
{
  private final int MAXHEAP =100;  //Arbitrarily picked
  protected HeapNode [] tree;      //The array to hold the heap nodes
  protected int insertPoint;       //Location of the place to put an new entry
  protected int size;

  public Heap()
  //PRE: None
  //POS: Empty heap; insertPoint == 0;
  //TAS: Create a new heap
  {
    tree = new HeapNode[MAXHEAP];
    insertPoint = 0;
    size = 0;
  }//Heap

  public boolean isEmpty()
  {
    return tree[0] == null;
  }

  public String toString()
  {
    String result = "";
    for (int i = 0; i < insertPoint; i++)
    {
      result += tree[i].getPriority()+" ";
    }
    return result;
  }

  private void swap (int parent, int child)
  //PRE: two or more nodes in heap
  //POS: tree[parent]<exit> == tree[child]<entry>
  //     tree[child]<exit> == tree[parent]<entry>
  //TAS: swap entries at parent and child
  {
    HeapNode temp = new HeapNode();
    temp.setElement(tree[parent].getElement());
    temp.setPriority(tree[parent].getPriority());

    tree[parent].setElement(tree[child].getElement());
    tree[parent].setPriority(tree[child].getPriority());

    tree[child].setElement(temp.getElement());
    tree[child].setPriority(temp.getPriority());
  }

  public void insert (Object newElement, int priority)
  //PRE: none
  //POS: tree<exit> == tree<entry> + newElement && tree is heap
  //POS: insertPoint<exit> == insertPoint<entry> + 1
  //TAS: insert newElement into tree heap
  {
    //Create the new HeapNode
    tree[insertPoint] = new HeapNode (newElement, priority);
    //Set up local variables
    boolean done = false;
    int parent = (insertPoint-1)/2;  //nifty trick for finding parent's location
    int child = insertPoint;
    insertPoint++;                   //increase to the next insertion location

    while ((parent >= 0) && !done)   //start hunting for correct location
    {
      if (tree[parent].getPriority() < tree[child].getPriority())
      {
        swap (parent,child);
        child = parent;
        parent = (parent -1)/2;
      }
      else
      {
        done = true;
      }
    }//while
  }//insert


  public Object peek ()
  //PRE: none
  //POS: none
  //TAS: return the object at top of heap
  {
    if (tree == null)
      return null;
    else
      return tree[0].getElement();
  }

  public void remove()
  //PRE: Tree is not empty
  //POS:
  //TAS:
  {
    //insert your code here
  }//remove
}//Heap