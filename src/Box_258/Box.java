package Box_258;
/*
   어서와 java는 처음이지! page 258
   - 생성자 ~ 상자를 나타내는 Box 클래스 작성
*/

public class Box {
  // private 접근 제어자를 설정하여, 같은 클래스에서만 접근 허용, 타 클래스에서는 간접 접근만 허용 가능토록 함
  private int width;
  private int length;
  private int height;
  private int volume;

  // public 메서드를 통한 private 멤버 변수 간접 접근하여 값을 반환함
  public int getVolume() {
    return volume;
  }

  // 매개변수 있는 생성자
  Box(int w, int l, int h) {
    width = w;
    length = l;
    height = h;
    volume = width * length * height;
  }
}
