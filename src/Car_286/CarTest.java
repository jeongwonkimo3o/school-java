package Car_286;

/*
   어서와 java는 처음이지! page 286
   - 자동차 시리얼 번호 구현
*/

public class CarTest {
    public static void main(String[] args) {

        // instance 생성
        Car c1 = new Car("S600", "white", 80);
        Car c2 = new Car("E500", "blue", 20);

        // 객체가 생성될 때마다 +1이 된 numbers의 값을 변수 n에 저장
        int n = Car.numbers;

        // 출력
        System.out.println("지금까지 생성된 자동차의 수 = " + n);
    }
}
