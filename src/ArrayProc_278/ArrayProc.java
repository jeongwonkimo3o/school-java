package ArrayProc_278;

import java.util.Scanner;

/*
   어서와 java는 처음이지! page 278
   - 배열에 저장된 값의 평균 구하기
*/

public class ArrayProc {

    // 값 가져오기
    public void getValues(int[] array) {
        Scanner scan = new Scanner(System.in);

        // 배열 길이만큼 반복문 돌면서 값을 입력 받음
        for (int i = 0; i < array.length; i++) {
            System.out.println("성적을 입력하시오: ");
            array[i] = scan.nextInt();
        }
    }

    // 평균
    public double getAverage(int[] array) {
        double total = 0; // 성적 합계

        // 배열 길이만큼 반복문 돌면서 total 변수에 성적을 더함
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        // total 변수를 배열 길이로 나눠서 반환
        return total / array.length;
    }
}
