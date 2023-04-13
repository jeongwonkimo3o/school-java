package Time_267;

/*
   어서와 java는 처음이지! page 267
   - 시간를 나타내는 time 클래스 작성
*/

public class Time {

  // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
  private int hour; // 0~23
  private int minute; // 0~59
  private int second; // 0~59

  // 생성자 오버로딩
  // 매개변수 없는 생성자
  public Time() {
    this(0, 0, 0);
  }

  // 매개변수 있는 생성자
  public Time(int h, int m, int s) {

    // 거짓일 경우(시간의 정상적인 범주를 넘었을 경우) 0으로 출력됨
    hour = ((h >= 0 && h < 24) ? h : 0);
    minute = ((m >= 0 && m < 60) ? m : 0);
    second = ((s >= 0 && s < 60) ? s : 0);
  }

  // "시:분:초"의 형식으로 출력
  // String.format 문자열의 형식을 설정하는 메서드(String 의 static 메서드)
  public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

}
