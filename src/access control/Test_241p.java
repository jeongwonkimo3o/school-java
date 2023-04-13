
/*
   어서와 java는 처음이지! page 241p
   - 자바의 접근 제어 지정자
*/

class A {
  private int a; // 같은 클래스에만 접근 가능
  int b; // 디폴트. 같은 클래스, 패키지에 접근 가능
  public int c; // 전체에서 접근 가능
}

public class Test_241p {
  public static void main(String[] args) {

    // instance 생성
    A obj = new A();

    obj.a = 10; // 다른 클래스이므로 접근이 불가능
    obj.b = 20; // 같은 패키지이므로 접근 가능
    obj.c = 30; // 접근 제어자가 public이므로 자유롭게 접근 가능

  }
}
