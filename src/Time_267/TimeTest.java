package Time_267;

/*
   어서와 java는 처음이지! page 267
   - 시간를 나타내는 time 클래스 작성
*/

public class TimeTest {
  public static void main(String[] args) {
    

    // instance 생성, 생성자에 따라 값이 할당됨
    // toString 메서드를 통해 시간 출력.

    Time time = new Time();
    System.out.println("기본 생성자 호출 후 시간: " + time.toString());

    Time time2 = new Time(13, 27, 6);
    System.out.println("두 번째 생성자 호출 후 시간: " + time2.toString());


    // 올바르지 않은 시간으로 설정할 경우
    Time time3 = new Time(99, 66, 77);
    System.out.println("올바르지 않은 시간 설정 후 시간: " + time3.toString());
  }
}
