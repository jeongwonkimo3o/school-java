package Rectangle_330;

/*
   어서와 java는 처음이지! page 330
   - 복잡한 상속 계층 구조 만들어보기
*/

public class Rectangle extends Shape {
  // private 멤버
  private int width;
  private int height;

  // 매개변수 있는 생성자
  public Rectangle(int x, int y, int width, int height) {
    super(x, y); // 부모 생성자 호출
    System.out.println("Rectangle()");
    this.width = width;
    this.height = height;
  }

  // width * height 반환
  double calcArea() {
    return width * height;
  }
}
