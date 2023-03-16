package Box_258;

/*
   어서와 java는 처음이지! page 258
   - 생성자 ~ 상자를 나타내는 Box 클래스 작성
*/

public class BoxTest {
  public static void main(String[] args) {

    // 객체 생성 및 생성자를 통한 멤버변수에 값 할당
    Box b;
    b = new Box(20, 20, 30);

    // 부피 출력
    System.out.println("상자의 부피는 " + b.getVolume() + "입니다.");
  }
}
