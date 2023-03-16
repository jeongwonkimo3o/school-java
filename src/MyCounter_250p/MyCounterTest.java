package MyCounter_250p;

/*
   어서와 java는 처음이지! page 250
   - 매개변수가 없는 생성자
*/

public class MyCounterTest {
  public static void main(String[] args) {

    // 객체 생성 - 생성자 호출
    MyCounter obj1 = new MyCounter();
    MyCounter obj2 = new MyCounter();

    // 출력
    System.out.println("객체 1의 counter = " + obj1.counter);
    System.out.println("객체 2의 counter = " + obj2.counter);

  }
}
