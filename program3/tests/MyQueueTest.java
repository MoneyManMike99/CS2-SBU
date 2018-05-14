package tests;
import maze.MyQueue;

public class MyQueueTest{
  public static void main(String[] args){
    MyQueue<String> queue = new MyQueue<String>();
    queue.add("A");
    queue.add("B");
    queue.add("C");
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
  }
}