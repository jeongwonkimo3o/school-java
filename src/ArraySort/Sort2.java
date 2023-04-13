package ArraySort;

public class Sort2 {
  public static void main(String[] args) {
    // 학생 객체 배열을 생성
    Student[] stds = new Student[5];

    // 학생 객체를 생성하고 배열에 추가
    stds[0] = new Student("김철수", "2001243");
    stds[1] = new Student("박영희", "2001342");
    stds[2] = new Student("오말숙", "2001134");
    stds[3] = new Student("강영식", "2001432");
    stds[4] = new Student("이희숙", "1924324");

    // 선택 정렬을 이용하여 학생 정보를 정렬
    Util.selectionSort(stds);

    // 정렬된 학생 정보를 출력
    for (Student std: stds) {
      System.out.println(std);
    }
  }
}