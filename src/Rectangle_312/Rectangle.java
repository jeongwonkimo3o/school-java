package Rectangle_312;

/*
   어서와 java는 처음이지! page 312
   - 도형 예제
*/

// Shape로부터 상속받음
public class Rectangle extends Shape {

  // private 접근 제어자를 통한 직접 접근 제어
  private int width;
  private int height;

  // public 메서드를 통한 간접 접근
  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  // double type으로 형변환 후 리턴
  double area() {
    return (double) width * height;
  }

  void draw() {
    System.out.println("(" + this.getX() + ", " + this.getY() + ") 위치에 " + "가로: " + width + " 세로: " + height);
  }
}
