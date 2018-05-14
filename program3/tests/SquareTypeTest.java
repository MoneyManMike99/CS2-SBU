package tests;
import maze.SquareType;

public class SquareTypeTest{
  public static void main(String[] args){
    System.out.println("expect:\t"+true);
    System.out.println("got:\t"+(SquareType.WALL==SquareType.fromChar('#')));
    try{
      System.out.println("expect:\tIllegalArgumentException");
      SquareType.fromChar('9');
    }catch(IllegalArgumentException e){
      System.out.println("got:\t"+e);
    }
  }
}