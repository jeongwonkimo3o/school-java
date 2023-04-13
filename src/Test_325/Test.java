package Test_325;
/*
   어서와 java는 처음이지! page 325
   - 상속과 생성자 1
*/

class Base {

  // 기본 생성자
  public Base() {
    System.out.println("Base() 생성자");
  }
};

class Derived extends Base {
  // 기본 생성자
  public Derived() {
    System.out.println("Derived() 생성자");
  }
};

public class Test {
  public static void main(String[] args) {
    // 객체 생성 & 생성자 호출
    Derived r = new Derived();
  }  
}
