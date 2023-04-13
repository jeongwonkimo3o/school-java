package Box_282;

/*
   어서와 java는 처음이지! page 282
   - 같은 크기의 Box인지 확인하기
*/

public class Box {

    // 접근 제어자를 통해 접근을 한정시킴
    private int width, length, height;

    // 매개변수 있는 생성자
    Box(int w, int l, int h) {
        width = w;
        height = h;
        length = l;
    }

    // 현재 Box 객체와 인수로 전달된 Box 객체를 비교
    boolean isSameBox(Box obj) {
        if ((obj.width == width) & (obj.length == length) & (obj.height == height)) {
            return true;
        }
        return false;
    }
}
