package Animal_310;

/*
   어서와 java는 처음이지! page 310
   - 동물 예제
*/

public class AnimalTest {
  public static void main(String[] args) {
    // instance 생성
    Lion lion = new Lion();

    // 메서드 호출
    lion.eat();
    lion.sleep();
    lion.roar();
    System.out.println("\n---------------------\n");

    // instance 생성
    Eagle eagle = new Eagle();

    // 메서드 호출
    eagle.eat();
    eagle.sleep();
    eagle.sleep();
  }

}
