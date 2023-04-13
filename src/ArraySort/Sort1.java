package ArraySort;
import java.util.*;

// 교수님 수업 정렬

public class Sort1 {
  public static void main(String[] args) {
    int[] values = new int[10];
    Random random = new Random(System.currentTimeMillis());

    // 배열에 랜덤한 정수값 넣기
    for (int i = 0; i < values.length; i++) {
      values[i] = random.nextInt(100);
    }

    // 정렬하기 전 배열 출력
    System.out.println("정렬하기 전:");
    for (int val : values) {
      System.out.print(val + " ");
    }

    // 선택정렬로 배열 정렬
    System.out.println("\n정렬 후 :");
    Util.selectionSort(values);
    for (int val : values) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}
