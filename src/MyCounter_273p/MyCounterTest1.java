package MyCounter_273p;

/*
   어서와 java는 처음이지! page 273
   - 메소드로 객체 전달하고 반환하기 예제1
*/

public class MyCounterTest1 {
  public static void main(String[] args) {

    // instance 생성
    MyCounter obj = new MyCounter();
    
    // int 자료형 변수 선언
    int x = 10;

    // inc 메서드에 변수 x의 값을 전달
    obj.inc(x);

    // 출력
    System.out.println("x = " + x);  // x의 복사본이 전달되므로 inc() 안에서 값 변동을 해도 MyCounterTest에 선언된 변수 x의 값에는 변동이 없음
  }
}
