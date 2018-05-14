package maze;

public class AStar<T> implements Agenda<T>{
    
  private Heap<T> heap;

  public AStar(){
    heap = new Heap<T>();
  }

  public boolean isEmpty(){
    return heap.isEmpty();
  }

  public int size(){
    return heap.size nb();
  }

  public void add(T newItem){
    heap.insert(newItem);
  }

  public T remove(){
    return heap.remove();
  }

  public T peek(){
    return heap.peek();
  }
}