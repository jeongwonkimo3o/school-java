package Rectangle_330;

/*
   어서와 java는 처음이지! page 330
   - 복잡한 상속 계층 구조 만들어보기
*/

public class Shape {
  // private 멤버
  private int x;
  private int y;

  // 생성자 (매개변수 있음)
  public Shape(int x, int y) {
    System.out.println("Shape()");
    this.x = x;
    this.y = y;
  }
}
