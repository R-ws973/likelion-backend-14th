package week3;
import java.util.Scanner;

public class practice3_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("학생 수를 입력하세요.");
    int students = sc.nextInt();
    int scores[] = new int[students];

    int total_sum = 0;

    System.out.println("학생들의 점수를 입력해주세요.");
    for (int i=0; i<students; i++) {
      scores[i] = sc.nextInt();
      total_sum += scores[i];
    }

    float total_mean = (float)total_sum / students;
    System.out.println("전체 평균은 " + total_mean + " 점입니다.");
  }
}
