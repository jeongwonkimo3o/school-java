package Date_264;

/*
   어서와 java는 처음이지! page 264
   - 날짜를 나타내는 Date 클래스 작성
*/

public class DateTest {
  public static void main(String[] args) {

    // instance 생성
    // 각 생성자마다 멤버 변수의 값이 할당됨
    Date date1 = new Date(2015, "8월", 10);
    Date date2 = new Date(2020);
    Date date3 = new Date();

    // 출력
    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);

  }
}
