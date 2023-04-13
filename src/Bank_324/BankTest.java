package Bank_324;
/*
   어서와 java는 처음이지! page 324
   - 다양한 이자율을 가지는 은행 클래스 작성하기
*/
class Bank {
  double getInterestRate() {
    return 0.0; // 이자율
  }
}

class BadBank extends Bank {
  // 메소드 오버라이딩
  double getInterestRate() {
    return 10.0; // 이자율
  }
}

class NormalBank extends Bank {
  // 메소드 오버라이딩
  double getInterestRate() {
    return 5.0; // 이자율
  }
}

class GoodBank extends Bank {
  // 메소드 오버라이딩
  double getInterestRate() {
    return 3.0; // 이자율
  }
}


public class BankTest {
  public static void main(String[] args) {
    
    // 인스턴스 생성
    BadBank b1 = new BadBank();
    NormalBank b2 = new NormalBank();
    GoodBank b3 = new GoodBank();

    // 메소드 호출 -> 이자율 출력
    System.out.println("BadBank의 이자율: " + b1.getInterestRate());
    System.out.println("NormalBank의 이자율: " + b2.getInterestRate());
    System.out.println("GoodBank의 이자율: " + b3.getInterestRate());
  }
}
