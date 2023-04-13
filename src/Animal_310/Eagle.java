package Animal_310;

/*
   어서와 java는 처음이지! page 310
   - 동물 예제
*/

public class Eagle extends Animal {
  // 접근제어자를 통한 접근 제한
  private int wings = 2;

  // 값을 반환
  public int getWings() {
    return wings;
  }

  // 값을 할당
  public void setWings(int wings) {
    this.wings = wings;
  }

  // 메서드 선언
  public void fly() {
    System.out.println("fly()가 호출되었음");
  }
}
