// This is a BST Tree implementing a recursive algorithm for
// search, insertion, deletion, printing, and determining maximum
// depth.
package binarysearchtree;

public class BinSrchTree{
  private BSTNode root; // The root of the Binary Search Tree.
  public BinSrchTree ()
  //PRE: None
  //POS: tree == null
  //TAS: Initialize the Binary Search tree to null
  {
    root = null;
  }

  boolean isEmpty ()
  //PRE: None
  //POS: None
  //TAS: return root being equal to null
  {
    return root == null;
  } // isEmpty method

  public Object search (String key)
  //PRE: init<key>
  //POS: none
  //TAS: Search the tree for object with key
  // if (object with this key is in the tree)
  // return a reference to the object
  // else
  // return a null reference
  {
    BSTNode node = recSearch (root, key);
    if (node == null)
    {
      return null;
    }
    else
    {
      return node.getElement ();
    }
  } // search method

  public void insert (String key, Object element)
  //PRE: init <key>, init<element>
  //POS: exit <tree> <-- entry <tree> + element
  //TAS: insert the object with key into the tree
  {
    root = recInsert (root, key, element);
  } // insert method

  private BSTNode recInsert (BSTNode node, String key,Object element)
  //PRE:
  //POS:
  //TAS:
  {
    if (node == null)
    {
      node = new BSTNode (key, element, null, null);
    }
    else if (key.compareTo (node.getKey ()) == 0)
    {
      node.setElement (element);
    }
    else if (key.compareTo (node.getKey ()) < 0)
    {
      node.setLeft (recInsert (node.getLeft (), key, element));
    }
    else
    {
      node.setRight (recInsert (node.getRight (), key, element));
    }
    return node;
  } // recInsert method

  public void delete (String key)
  //PRE:
  //POS:
  //TAS:
  {
    root = recDelete (root, key);
  } // delete method

  public void printTree ()
  //PRE:
  //POS:
  //TAS:
  {
    System.out.println(this.toString());
  } // printTree method

  public String toString(){
    return recToString(root);
  }

  private String recToString(BSTNode node)
  //PRE:
  //POS:
  //TAS:
  {
    if (node == null)
      return "";
    return
      recToString(node.getLeft()) + node.getKey() + recToString(node.getRight());
  }

  public int depth ()
  //PRE:
  //POS:
  //TAS:
  {
    return recDepth (root);
  } // depth method

  protected int recDepth (BSTNode node)
  //PRE:
  //POS:
  //TAS:
  {
    if (node == null)
    {
         return 0;
    }
    else
    {
      return 1 + Math.max ( recDepth (node.getLeft ()), recDepth (node.getRight ()));
    }
  } // recDepth method

  private BSTNode recSearch (BSTNode node, String key) 
    //PRE: None 
    //POS: None
    //TAS: return the node containing key or null if not found 
  { 
    if (node == null)//not in tree 
    { 
      return null; 
    } 
    else if (key.compareTo (node.getKey ()) == 0) //found it!
    { 
      return node;
    } 
    else if (key.compareTo (node.getKey ()) < 0) //go left
    { 
      return (recSearch (node.getLeft (), key)); 
    } 
    else //go right
    { 
      return (recSearch (node.getRight(), key));
    } 
  } // recSearch method 
  
  private BSTNode recDelete (BSTNode node, String key) 
  //TAS: Currently, this method is stubbed; it is returning 
  // null because it has to return something. 
  { 
    if (node == null){ 
      System.out.println ("Unable to find node with key."); 
      return null; 
    }else if (key.compareTo (node.getKey ()) == 0){
      node = remove (node); 
    }else if (key.compareTo (node.getKey()) < 0){
      node.setLeft (recDelete (node.getLeft (), key)); 
    }else{
      node.setRight (recDelete (node.getRight(), key)); 
    }
    return node; 
  } // recDelete method 
  
  private BSTNode remove (BSTNode node) 
  { 
    // PRE: node points to delete node 
    // POS: exit<tree> = entry<tree> - node<key> 
    // TAS: Delete the node and reattach subtrees of deleted node 
    BSTNode here = node; 
    if (node.getLeft() == null){       // CASE 1: No L. Child
      return node.getRight();         // so promote R. subtree
    } 
    else if (node.getRight() == null){  // CASE 2: No R. Child 
      return node.getLeft();          // so promote L. subtree 
    } 
    else{                                   // CASE 3: two children
      node = node.getRight ();        // so point to R child 
      BSTNode temp = node;            // set temp to node 
      while (temp.getLeft() != null){  // find node in right 
        temp = temp.getLeft();
      }                               // subtree w largest key 
      temp.setLeft (here.getLeft());  // attach left subtree 
      return node;                    // quit 
    }//else 
  }
} /* BinSrchTree class */

