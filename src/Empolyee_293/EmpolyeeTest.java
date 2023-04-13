package Empolyee_293;

import java.util.Scanner;

/*
   어서와 java는 처음이지! page 293
   - 직원 클래스 작성
*/

public class EmpolyeeTest {
  public static void main(String[] args) {

    // instance 생성, 생성자를 통한 값 전달
    // instance 생성마다 count 값이 1씩 증가
    Empolyee e1 = new Empolyee("김철수", 35000);
    Empolyee e2 = new Empolyee("최수철", 50000);
    Empolyee e3 = new Empolyee("김철호", 20000);

    System.out.println("현재의 직원수= " + Empolyee.getCount());

    // 빈 값으로 처리
    e1 = null;

    // 명시적으로 가비지 컬렉션이 일어나도록 함
    System.gc();
    System.out.println("계속하려면 enter를 치세요.");

    // 엔터 처리
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();

    System.out.println("현재의 직원수= " + Empolyee.getCount());
  }
}
