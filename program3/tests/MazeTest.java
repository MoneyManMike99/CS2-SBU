package tests;

import maze.Maze;
import java.io.FileNotFoundException;

public class MazeTest{
  public static void main(String[] args){
    try{
      Maze m = new Maze("maze1.txt");
      System.out.println(m);
    }catch(FileNotFoundException e){
      System.out.println(e);
    }
  }
}