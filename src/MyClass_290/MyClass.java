package MyClass_290;

/*
   어서와 java는 처음이지! page 290
   - 정적 초기화 블록
*/

public class MyClass {
    static int x; // 정적 변수(static 변수 or 클래스 변수)
    int y;

    // 정적 초기화 블록
    static {
        x = 10;
        System.out.println("정적 블록이 호출되었음!");
    }
}
