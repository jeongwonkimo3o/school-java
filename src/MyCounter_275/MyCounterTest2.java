package MyCounter_275;

/*
   어서와 java는 처음이지! page 275
   - 메소드로 객체 전달하고 반환하기 예제2
*/

public class MyCounterTest2 {
    public static void main(String[] args) {

        // instance 생성
        MyCounter obj = new MyCounter();

        // 출력
        System.out.println("obj.value = " + obj.value);

        // inc 메서드를 통한 객체 내용 변경 후 재출력
        obj.inc(obj);
        System.out.println("obj.value = " + obj.value);
    }
}
