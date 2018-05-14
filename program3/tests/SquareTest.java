package tests;
import maze.SquareType;
import maze.Square;

public class SquareTest{
  public static void main(String[] args){
    Square square = new Square(SquareType.SPACE, 1, 1);
    System.out.println("expect:\t.");
    System.out.println("got:\t"+square);

    square.markTried();
    System.out.println("expect:\tx");
    System.out.println("got:\t"+square);
  }
}