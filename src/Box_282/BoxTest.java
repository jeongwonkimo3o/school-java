package Box_282;

/*
   어서와 java는 처음이지! page 282
   - 같은 크기의 Box인지 확인하기
*/

public class BoxTest {
    public static void main(String[] args) {
        // instance 생성
        Box obj1 = new Box(10, 20, 50);
        Box obj2 = new Box(10, 20, 50);

        // 출력
        // obj1의 box 객체와 obj2의 box 객체를 비교하여 T/F 출력
        System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
    }
}
