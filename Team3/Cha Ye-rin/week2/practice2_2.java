package week2;

public class practice2_2 {
  public static void main(String[] args) {
    // 1부터 10까지 1씩 증가시키며 반복합니다.
    for (int i=1; i<=10; i++) {
      // 1씩 증가하는 i값을 if문에 넣어 반복실행합니다.
      if (i % 2 == 0) {
        System.out.println(i + "는 짝수입니다.");
      } else {
        System.out.println(i + "는 홀수입니다.");
      }
    }
  }
}