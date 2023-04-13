package Date_264;

/*
   어서와 java는 처음이지! page 264
   - 날짜를 나타내는 Date 클래스 작성
*/

public class Date {
  // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
  private int year;
  private String month;
  private int day;

  // 생성자 오버로딩

  // 매개변수 없는 생성자
  public Date() {
    this(1900, "1월", 1);
  }

  // 매개변수 있는 생성자
  public Date(int year) {
    this(year, "1월", 1);
  }

  // 매개변수 있는 생성자
  public Date(int year, String month, int day) {
    this.month = month;
    this.day = day;
    this.year = year;
  }

  // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
  // toString: 객체를 문자열로 표현하는 메서드
  @Override
  public String toString() {
    return "Date [year = " + year + ", month = " + month + " day = " + day + "]";
  }
}
