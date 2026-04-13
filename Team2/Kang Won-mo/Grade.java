import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("점수를 입력하세요: ");
    int score = sc.nextInt();

    if (score < 0 || score > 100) {
      System.out.println("잘못된 점수입니다. 0~100 사이의 값을 입력하세요.");
    } else if (score >= 90) {
      System.out.println("등급: A");
    } else if (score >= 80) {
      System.out.println("등급: B");
    } else if (score >= 70) {
      System.out.println("등급: C");
    } else {
      System.out.println("등급: D");
    }

    sc.close();
  }
}