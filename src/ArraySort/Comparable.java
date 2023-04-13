package ArraySort;

// 비교 가능한 데이터 타입의 추상 클래스
abstract public class Comparable {
  // 내가 더 크면 1, anotherVal하고 값이 같으면 0, 내가 더 작으면 -1
  public abstract int compareTo(Comparable anotherVal);
}
