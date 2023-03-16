package SafeArray_248;


/*
   어서와 java는 처음이지! page 248p
   - 안전한 배열 만들기
*/


public class SafeArrayTest {
  public static void main(String[] args) {

    // instance 생성
    SafeArray array = new SafeArray(3);

    // index가 0 이상이고 배열 길이보다 -1 작은 조건에 해당되지 않으면 msg 출력. 해당되면 각 인덱스에 index * 10한 값을 put method를 통해 push
    for (int i = 0; i < (array.length + 1); i++) {
      array.put(i, i * 10);
    }
  }
}
