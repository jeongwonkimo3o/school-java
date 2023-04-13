package Box_279;

/*
   어서와 java는 처음이지! page 279
   - 메소드에서 객체 반환하기
*/

public class BoxTest {
    public static void main(String[] args) {

        // instance 생성
        Box obj1 = new Box(10, 20, 50);
        Box obj2 = new Box(10, 30, 30);

        // 박스 비교 후 더 큰 박스의 w / l / h 값 반환
        Box largest = obj1.whosLargest(obj1, obj2);
        System.out.println("(" + largest.width + ", " + largest.length + ", " + largest.height + ")");
    }
}
