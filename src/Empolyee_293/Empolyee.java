package Empolyee_293;

/*
   어서와 java는 처음이지! page 293
   - 직원 클래스 작성
*/
public class Empolyee {
  // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
  private String name;
  private double salary;

  private static int count = 0; // 정적 변수

  // 매개변수 있는 생성자
  public Empolyee(String n, double s) {
    name = n;
    salary = s;
    count++; // 정적변수인 count를 증가
  }

  protected void finalize() {
    count--; // 직원 감소에 따른 count -1
  }

  // 정적 메소드
  public static int getCount() {
    return count;
  }
}
