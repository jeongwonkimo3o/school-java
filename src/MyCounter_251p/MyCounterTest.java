package MyCounter_251p;
/*
   어서와 java는 처음이지! page 251
   - 매개변수를 가지는 생성자
*/

public class MyCounterTest {
  public static void main(String[] args) {

    // instance 생성, 생성자를 통해 멤버 변수에 값을 할당
    MyCounter obj1 = new MyCounter(100);
    MyCounter obj2 = new MyCounter(200);

    // 출력
    System.out.println("객체 1의 counter = " + obj1.counter);
    System.out.println("객체 2의 counter = " + obj2.counter);
  }
}
