package Television_255;

/*
   어서와 java는 처음이지! page 255
   - Television 생성자
*/

public class Television {

  // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
  private int channel;
  private int volume;
  private boolean onOff;

  // 매개변수 있는 생성자
  Television(int c, int v, boolean o) {
    channel = c;
    volume = v;
    onOff = o;
  }

  // Television 정보 출력 메서드.
  void print() {
    System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
  }
}
