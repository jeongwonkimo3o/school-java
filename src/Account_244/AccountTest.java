package Account_244;

/*
   어서와 java는 처음이지! page 244p
   - 접근자와 설정자
*/

public class AccountTest {
  public static void main(String[] args) {
    // instance 생성
    Account obj = new Account();

    /* 특별한 사유가 없는 이상 멤버 변수에는 private를 걸어두고, public 메서드를 통해 멤버 변수에 간접접근 하도록 하는 것이 좋음 */

    // 값 할당 (메서드를 통한 간접접근)
    obj.setName("Tom"); 
    obj.setBalance(100000);
  
    // 값 반환 (메서드를 통한 간접접근)
    System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
  }
}
