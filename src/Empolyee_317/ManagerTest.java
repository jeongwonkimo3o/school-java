package Empolyee_317;

/*
   어서와 java는 처음이지! page 317
   - 직원과 매니저 클래스 작성(상속 접근 제어)
*/

public class ManagerTest {
  public static void main(String[] args) {


    // 객체 생성 및 생성자
    Manager m = new Manager("Tom", "Seoul", 1000000, 123456, 50000);
    
    // 출력
    System.out.println(m);
    m.test();
  }
}
