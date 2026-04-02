package week3;
import java.util.Scanner;

public class practice3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score;
    String grade;

    while (true) {
      System.out.println("점수를 입력해주세요.");
      score = sc.nextInt();

      if (score < 0 || score >  100) {
        System.out.println("점수를 잘못 입력하였습니다.");
        System.out.println("0~100 사이 숫자를 입력해주세요.");
        continue;
      } else {
        break;
      }
    }

    if (score >= 90) {
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else if (score >= 70) {
      grade = "C";
    } else {
      grade = "D";
    }

    System.out.println("당신의 등급은 " + grade + " 입니다.");
  }
}
