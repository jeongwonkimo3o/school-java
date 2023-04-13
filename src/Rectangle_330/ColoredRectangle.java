package Rectangle_330;

/*
   어서와 java는 처음이지! page 330
   - 복잡한 상속 계층 구조 만들어보기
*/

public class ColoredRectangle extends Rectangle {
  String color;

  // 매개변수 있는 생성자
  public ColoredRectangle(int x, int y, int width, int height, String color) {
    super(x, y, width, height); // 부모 생성자 호출
    System.out.println("ColoredRectangle()");
    this.color = color;
  }

  public static void main(String[] args) {

    // 객체 생성 & 생성자 호출
    ColoredRectangle obj = new ColoredRectangle(10, 10, 20, 20, "red");
  }
}
