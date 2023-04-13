package Animal_310;

/*
   어서와 java는 처음이지! page 310
   - 동물 예제
*/

public class Lion extends Animal {
// 접근 제어자를 통한 접근 제한
  private int legs = 4;

  // 값을 반환
  public int getLegs() {
    return legs;
  }

  // 값을 할당
  public void setLegs(int legs) {
    this.legs = legs;
  }

  // 메서드 선언
  public void roar() {
    System.out.println("roar()이 호출됨");
  }
}
