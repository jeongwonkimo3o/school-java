package SafeArray_248;

/*
   어서와 java는 처음이지! page 248p
   - 안전한 배열 만들기
*/

public class SafeArray {
  private int a[];    // 같은 클래스에만 접근 가능
  public int length;  // 전체에서 접근 가능

  // 간접 접근을 통해 멤버 변수 값 할당하는 생성자
  public SafeArray(int size) {  // ex: 5  
    a = new int[size];  // 0, 1, 2, 3, 4
    length = size;      // 배열 길이: 5
  }

  // index가 0 이상이고 배열 길이보다 -1 작은 조건에 해당되지 않으면 return -1.
  // 조건에 해당될 경우 해당 index의 값 get.
  public int get(int index) {
    if (index >= 0 && index < length) {
      return a[index];
    }

    return -1; // return -1 : 오류가 있음을 뜻함
  }

  // index가 0 이상이고 배열 길이보다 -1 작은 조건에 해당되지 않으면 msg 출력.
  // 조건에 해당될 경우 해당 index에 값 push.
  public void put(int index, int value) {
    if (index >= 0 && index < length) {
      a[index] = value;
    } else {
      System.out.println("잘못된 인덱스 " + index);
    }
  }
}
