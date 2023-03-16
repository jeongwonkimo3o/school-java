package Student_259;
/*
   어서와 java는 처음이지! page 259
   - 생성자 오버로딩
*/

public class StudentTest {
  public static void main(String[] args) {

    // instance 생성 (매개변수 없는 생성자)
    Student obj1 = new Student();

    // 출력
    System.out.println(obj1);

    // instance 생성 (매개변수 있는 생성자, 하기 값이 멤버 변수에 할당됨)
    Student obj2 = new Student(111, "kim", 25);

    // 출력
    System.out.println(obj2);
  }
}
