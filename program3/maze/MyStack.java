package maze;
import java.util.Stack;

public class MyStack<T> implements Agenda<T>{
  private Stack<T> stack;

  public MyStack(){
    stack = new Stack<T>();
  }

  public boolean isEmpty(){
    return stack.isEmpty();
  }

  public int size(){
    return stack.size();
  }

  public void add(T newItem){
    stack.add(newItem);
  }

  public T remove(){
    return stack.pop();
  }

  public T peek(){
    return stack.peek();
  }
}