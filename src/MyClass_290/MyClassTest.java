package MyClass_290;

/*
   어서와 java는 처음이지! page 290
   - 정적 초기화 블록
*/

public class MyClassTest {
    public static void main(String[] args) {

        // 정적 변수가 사용되므로 정적 블록에 의해 초기화
        System.out.println(MyClass.x); // static 변수이므로 객체를 생성하지 않고도 접근 가능

    }
}
