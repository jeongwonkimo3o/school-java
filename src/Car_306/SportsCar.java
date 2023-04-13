package Car_306;

/*
   어서와 java는 처음이지! page 306
   - 상속 예제: 자동차
*/

// Car의 멤버들을 상속 받음(생성자와 초기화 블록은 상속되지 않음)
public class SportsCar extends Car {

  // 멤버 변수
  private boolean turbo;

  // 메서드를 통해 멤버 변수에 간접 접근
  public boolean isTurbo() {
    return turbo;
  }

  public void setTurbo(boolean flag) {
    turbo = flag; // flag의 boolean 값을 turbo에 할당
  }

  @Override
  public String toString() {
    return "speed[" + getSpeed() + "], turbo[" + isTurbo() + "]";

  }
}
