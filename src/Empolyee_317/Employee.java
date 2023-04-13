package Empolyee_317;

/*
   어서와 java는 처음이지! page 317
   - 직원과 매니저 클래스 작성(상속 접근 제어)
*/

public class Employee {
  public String name;   // 이름: public 멤버
  String address;       // 주소: package 멤버
  protected int salary; // 월급: protected 멤버
  private int rrn;      // 주민등록번호: private 멤버

  // 매개변수 있는 생성자
  public Employee(String name, String address, int salary, int rrn) {
    this.name = name;
    this.address = address;
    this.salary = salary;
    this.rrn = rrn;
  }

  // 이노테이션
  @Override
  public String toString() {
    return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
  }
}
