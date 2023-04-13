package Object;

public class CarTest {
  public static void main(String[] args) {
    // 인스턴스 생성
    // Car obj = new Car();

    // // getClass: 해당 객체가 어떤 클래스로부터 만들어졌는지에 대한 정보를 반환하는 메소드
    // Class classVar = obj.getClass();
    // System.out.println(classVar.getName()); // Object.Car (PackageName.ObjectName)

    // System.out.println("브랜드: " + Car.brand + ", " + "모델: " + Car.model);

    Car car1 = new Car("현대", "그랜저");
    Car car2 = new Car("현대", "그랜저");

    System.out.println(car1.equals(car2));

 
  }
}
