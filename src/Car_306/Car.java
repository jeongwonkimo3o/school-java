package Car_306;

/*
   어서와 java는 처음이지! page 306
   - 상속 예제: 자동차
*/

public class Car {
  private int speed; // 멤버 변수

  // 멤버 변수의 값에 메서드를 통해 간접접근
  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;  // 멤버 변수에 매개 변수의 값을 할당
  }
  
}
