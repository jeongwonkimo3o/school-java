package Test_325;
/*
   어서와 java는 처음이지! page 326
   - 명시적 호출
*/

class Shape {

  // 생성자
  public Shape() {
    System.out.println("Shape 생성자()");
  }
};

class Rectangle extends Shape {

  // 생성자
  public Rectangle() {
    super(); // 명시적 호출
    System.out.println("Rectangle 생성자()");
  }
};

public class Test2 {
  public static void main(String[] args) {
  
  // 객체 생성 및 생성자 호출
    Rectangle r = new Rectangle();
  }
};
