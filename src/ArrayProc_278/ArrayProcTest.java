package ArrayProc_278;

/*
   어서와 java는 처음이지! page 278
   - 배열에 저장된 값의 평균 구하기
*/

public class ArrayProcTest {
    final static int STUDENTS = 5; // 학생 수를 상수로 선언

    public static void main(String[] args) {
        int[] scores = new int[STUDENTS]; // 학생 수만큼의 길이를 가진 배열 생성

        // instance 생성
        ArrayProc obj = new ArrayProc();

        // inc 메서드를 통한 객체 내용 변경
        obj.getValues(scores);

        // 출력
        System.out.println("평균은 = " + obj.getAverage(scores));
    }
}
