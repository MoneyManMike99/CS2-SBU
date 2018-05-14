package binarysearchtree;

public class BSTNode
{
  protected String key;
  protected Object element;
  protected BSTNode left, right;
  protected int height;
  protected int newHeight; 
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
  
  public int getHeight(){
    return height;
  }
  
  public void setHeight(int newHeight){
    height = newHeight;
  }
  
  
  
  
  
  public void print() {
    if (right != null) {
      right.recPrint(true, "");
    }
    System.out.println(key);
    if (left != null) {
      left.recPrint(false, "");
    }
  }
  
  private void recPrint(boolean isRight, String indent){
    if (right != null) {
      right.recPrint(true, indent + (isRight ? "        " : " |      "));
    }
    System.out.print(indent);
    if (isRight) {
      System.out.print(" /");
    } else {
      System.out.print(" \\");
    }
    System.out.println("----- "+key);
    if (left != null) {
      left.recPrint(false, indent + (isRight ? " |      " : "        "));
    }
  }
} /* BSTNode class */