package ArrayProc_276;

/*
   어서와 java는 처음이지! page 276
   - 메소드로 객체 전달하고 반환하기 예제3
*/

public class ArrayProcTest {
    public static void main(String[] args) {

        // 배열 선언
        int[] list = { 1, 2, 3, 4, 5 };

        // instance 생성
        ArrayProc obj = new ArrayProc();

        // inc 메서드를 통한 객체 내용 변경
        obj.inc(list);

        // 반복문 출력
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
