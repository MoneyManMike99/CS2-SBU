package heap;

public class HeapNode
{
  protected Object element; // The entry's data.
  protected int priority; // The entry's priority.

  public HeapNode()
  {
    element = null;
    priority = 100;
  }

  public HeapNode (Object element, int priority)
  {
    this.element = element;
    this.priority = priority;
  }

  public Object getElement ()
  {
    return element;
  }

  public int getPriority ()
  {
    return priority;
  }

  public void setElement(Object newElement)
  {
    element = newElement;
  }

  public void setPriority (int newPriority)
  {
    priority = newPriority;
  }
}