package Student_259;
/*
   어서와 java는 처음이지! page 259
   - 생성자 오버로딩
*/

public class Student {
  // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
  private int number;
  private String name;
  private int age;

  // 매개변수 없는 생성자
  Student() {
    number = 100;
    name = "New Student";
    age = 18;
  }

  // 매개변수 있는 생성자
  Student(int number, String name, int age) {
    this.number = number;
    this.name = name;
    this.age = age;
  }

  // @Override: 어노테이션(Annotation)으로 메서드를 오버라이딩하여 정의
  // toString: 객체를 문자열로 표현하는 메서드
  @Override
  public String toString() {
    return "Student [number = " + number + ", name = " + name + ", age = " + age + "]";
  }
}
