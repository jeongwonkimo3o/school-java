package ArrayProc_276;
/*
   어서와 java는 처음이지! page 276
   - 메소드로 객체 전달하고 반환하기 예제3
*/

public class ArrayProc {

    // 배열도 객체이므로 메서드에 배열이 전달되도 객체가 전달되는 것과 동일하게 처리
    void inc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }
}
