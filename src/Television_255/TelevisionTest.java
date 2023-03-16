package Television_255;

/*
   어서와 java는 처음이지! page 255
   - Television 생성자
*/

public class TelevisionTest {
  public static void main(String[] args) {

    // 객체 생성 및 생성자를 통한 멤버변수에 값 할당
    Television myTv = new Television(7, 10, true);
    // 할당된 멤버 변수들 정보 print
    myTv.print();

    // 상기와 동일
    Television yourTv = new Television(11, 20, true);
    yourTv.print();
  }
}
