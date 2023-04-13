package Car_288;
/*
   어서와 java는 처음이지! page 288
   - 자동차 시리얼 번호 구현(정적메서드)
*/

public class CarTest {
    public static void main(String[] args) {

        // instance 생성
        Car c1 = new Car("S600", "white", 80);
        Car c2 = new Car("E500", "blue", 20);

        // 객체가 생성될 때마다 +1이 된 numbers의 값을 getNumberOfCars 메서드를 통해 접근 후 반환하여 변수 n에 저장
        int n = Car.getNumberOfCars();

        // 출력
        System.out.println("지금까지 생성된 자동차의 수 = " + n);
    }
}
