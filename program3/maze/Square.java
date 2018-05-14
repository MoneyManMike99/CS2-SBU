package maze;

public class Square{
  private SquareType type;
  private int row;
  private int col;

  public Square(SquareType type, int row, int col){
    this.type = type;
    this.row = row;
    this.col = col;
  }

  public SquareType getType(){
    return type;
  }

  public void markTried(){
    type = SquareType.TRIED;
  }

  public int getRow(){
    return row;
  }

  public int getCol(){
    return col;
  }

  public String toString(){
    return type.toString();
  }
}