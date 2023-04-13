package Rectangle_312;

/*
   어서와 java는 처음이지! page 312
   - 도형 예제
*/

public class Shape {

  // private 접근 제어자를 통한 직접 접근 제어

  private int x;
  private int y;

  // public 메서드를 통해 값을 할당하고 반환
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  void print() {
    System.out.println("X좌표: " + x + " y좌표: " + y);
  }
}
