package binarysearchtree;

public class BSTNode
{
  protected String key;
  protected Object element;
  protected BSTNode left, right;
  public BSTNode (String key, Object element, BSTNode left, BSTNode right)
  {
    this.key = key;
    this.element = element;
    this.left = left;
    this.right = right;
  } // BSTNode constructor

  public String getKey ()
  {
    return key;
  } // getKey method

  public Object getElement ()
  {
    return element;
  } // getElement method

  public BSTNode getLeft ()
  {
    return left;
  } // getLeft method

  public BSTNode getRight ()
  {
    return right;
  } // getRight method

  public void setElement (Object element)
  {
    this.element = element;
  } // setElement method

  public void setLeft (BSTNode node)
  {
    left = node;
  } // setLeft method

  public void setRight (BSTNode node)
  {
    right = node;
  } // setRight method
} /* BSTNode class */