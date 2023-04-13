package Parent_321;
/*
   어서와 java는 처음이지! page 321
   - super
*/
public class Child extends Parent{
  public void print() {
    super.print(); // 부모 클래스 메소드 호출
    System.out.println("자식 클래스의 print() 메소드");
  }

  public static void main(String[] args) {

    // 객체 생성
    Child obj = new Child();

    // 메소드 호출
    obj.print();
  }
}
