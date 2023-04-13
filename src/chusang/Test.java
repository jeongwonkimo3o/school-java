package chusang;

public class Test {
  public static void main(String[] args) {
    // 추상 클래스는 객체를 생성할 수 없음
    // Shape s = new Shape();

    Rectangle R = new Rectangle();
    Circle C = new Circle();
    Triangle T = new Triangle();

    R.draw();
    R.move(10, 20);
    C.draw();
    C.move(10, 20);
    T.draw();
    T.move(10, 20);
  }
}
