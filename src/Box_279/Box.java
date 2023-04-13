package Box_279;
/*
   어서와 java는 처음이지! page 279
   - 메소드에서 객체 반환하기
*/

public class Box {

    // 멤버 변수
    int width, length, height;
    int volume;

    // 매개변수 있는 생성자
    Box(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
        volume = w * l * h;
    }

    // 2개의 박스 중에서 큰 박스 객체를 반환함
    Box whosLargest(Box box1, Box box2) {
        if (box1.volume > box2.volume) {
            return box1;
        }
        return box2;
    }
}
