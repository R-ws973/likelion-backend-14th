import java.util.Scanner;

public class Problem2_Grade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("점수를 입력하세요 (0~100): ");
    int score = sc.nextInt();

    if (score < 0 || score > 100) {
      System.out.println("잘못된 입력입니다. 0~100 사이의 점수를 입력해주세요.");
    } else {
      String grade;

      if (score >= 90) {
        grade = "A";
      } else if (score >= 80) {
        grade = "B";
      } else if (score >= 70) {
        grade = "C";
      } else {
        grade = "D";
      }

      System.out.println("입력한 점수: " + score + "점");
      System.out.println("등급: " + grade);
    }

    sc.close();
  }
}