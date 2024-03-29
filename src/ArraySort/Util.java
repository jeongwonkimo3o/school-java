package ArraySort;
// 배열
public class Util {

  // int형 배열을 선택정렬로 정렬하는 메소드
  public static void selectionSort(int[] values) {
      for (int i = 0; i < values.length; i++) {
        int minIdx = i;
        for (int j = i+1; j < values.length; j++ ) {
          // 현재까지 찾은 최소값(values[minIdx])과
          // values[j]를 비교해서 values[j]가 더 작으면
          // minIdx를 j로 설정 : minIdx = j
          if (values[minIdx] > values[j]) {
              minIdx = j;
          }
        }
        // minIdx의 값과 i의 값을 교환
        swap(i, minIdx, values);
      }
  }

  // Comparable 배열을 선택정렬로 정렬하는 메소드
  public static void selectionSort(Comparable[] values) {
    for (int i = 0; i < values.length; i++) {
      int minIdx = i;
      for (int j = i+1; j < values.length; j++ ) {
        // 현재까지 찾은 최소값(values[minIdx])과
        // values[j]를 비교해서 values[j]가 더 작으면
        // minIdx를 j로 설정 : minIdx = j
        if (values[minIdx].compareTo(values[j]) > 0 ) {
            minIdx = j;
        }
      }
      // minIdx의 값과 i의 값을 교환
      swap(i, minIdx, values);
    }
  }

  // int형 배열에서 두 인덱스의 값을 바꾸는 메소드
  private static void swap(int idx1, int idx2, int[] values) {
    int tmp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tmp;
  }

  // Comparable 배열에서 두 인덱스의 값을 바꾸는 메소드
  private static void swap(int idx1, int idx2, Comparable[] values) {
    Comparable tmp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = tmp;
  }
}
