package Circle_270;
/*
   어서와 java는 처음이지! page 270
   - 원을 나타내는 Circle 클래스 작성
*/

public class CircleTest {
  public static void main(String[] args) {

    // instance 생성, 생성자에 따른 멤버 변수 값 할당
    Point p = new Point(25, 78);

    // 참조변수 p의 참조값이 생성자에 할당하므로, 참조변수 p의 생성자를 통해 값이 할당된 멤버 변수 참조값이 참조변수 c에 넘겨짐
    Circle c = new Circle(p, 10);

    // 출력
    System.out.println(c);
  }
}
