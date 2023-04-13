package Animal_310;

/*
   어서와 java는 처음이지! page 310
   - 동물 예제
*/

public class Animal {

  // 접근제어자를 통한 접근 제한
  private double weight;
  private String picture;

  // 메서드 선언
  // protected: 같은 클래스, 같은 패키지, 자손클래스
  protected void eat() {
    System.out.println("eat()이 호출됨");
  }

  void sleep() {
    System.out.println("sleep()이 호출됨");
  }

  // 값을 반환
  public double getWeight() {
    return weight;
  }

  // 값을 할당
  public void setWeight(double weight) {
    this.weight = weight;
  }

  // 값을 반환
  public String getPicture() {
    return picture;
  }

  // 값을 할당
  public void setPicture(String picture) {
    this.picture = picture;
  }
}
