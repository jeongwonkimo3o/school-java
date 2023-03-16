package Circle_270;
/*
   어서와 java는 처음이지! page 270
   - 원을 나타내는 Circle 클래스 작성
*/

public class Point {

  // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
  private int x, y;

  // 매개변수 있는 생성자
  public Point(int a, int b) {
    x = a;
    y = b;
  }

  // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
  // toString: 객체를 문자열로 표현하는 메서드
  @Override
  public String toString() {
    return "Point [x = " + x + ", y = " + y + "]";
  }
}
