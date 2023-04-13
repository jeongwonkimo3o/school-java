package MyCounter_275;

/*
   어서와 java는 처음이지! page 275
   - 메소드로 객체 전달하고 반환하기 예제2
*/

public class MyCounter {

    // 멤버 변수
    int value = 0;

    // 객체를 메소드로 전달
    void inc(MyCounter ctr) {
        ctr.value = ctr.value + 1;
    }
}
