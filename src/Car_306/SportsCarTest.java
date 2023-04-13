package Car_306;

/*
   어서와 java는 처음이지! page 306
   - 상속 예제: 자동차
*/

public class SportsCarTest {
  
  
  public static void main(String[] args) {

    // instance 생성
    SportsCar sc = new SportsCar();
    sc.setSpeed(150);
    sc.setTurbo(true);

    System.out.println(sc);
  }
}
