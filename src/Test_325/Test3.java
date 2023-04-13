package Test_325;
/*
   어서와 java는 처음이지! page 327
   - 묵시적 호출
*/

class Shape {

  // 생성자
  public Shape() {
    System.out.println("Shape 생성자()");
  }
};

class Rectangle extends Shape {

  // 생성자
  public Rectangle() { // 컴파일러가 Shape();를 자동적으로 생성
    System.out.println("Rectangle 생성자()");
  }
};


public class Test3 {
  public static void main(String[] args) {
  
    // 객체 생성 및 생성자 호출
      Rectangle r = new Rectangle();
    }
}
