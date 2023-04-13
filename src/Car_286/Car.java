package Car_286;

/*
   어서와 java는 처음이지! page 286
   - 자동차 시리얼 번호 구현
*/

public class Car {

    // 접근제어자를 통해 접근을 제한시킴
    private String model;
    private String color;
    private int speed;

    // 자동차 시리얼 번호
    private int id;
    static int numbers = 0; // 생성된 Car 객체의 개수를 위한 정적 변수(static 변수 or 클래스 변수)

    // 매개변수 있는 생성자
    public Car(String m, String c, int s) {
        model = m;
        color = c;
        speed = s;
        // 객체 생성마다 자동차의 개수를 증가시키고 id에 대입
        id = ++numbers;
    }
}
