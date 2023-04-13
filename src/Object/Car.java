package Object;

public class Car {
  String brand;
  String model;

  
  // 매개변수 받는 생성자
  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  // 매개변수 없는 생성자
  public Car() {
    this("unknown", "Unknown"); // this("unknown", "Unknown") -> 두 개의 매개변수가 있는 다른 생성자를 호출
  }

  @Override
  public boolean equals(Object o) {

    if (o == null) return false;
    // obj는 Car 클래스의 객체라 가정
    // 그래야, Car 클래스 인스턴스의 brand, model 멤버에 접근할 수 있음
    // 하향 형변환

    Car yourCar = (Car)o;
    
    // 값 비교
    if (yourCar.brand.equals(brand) && yourCar.model.equals(model)) {
      return true;
    }
    return false;
  }
}
  


