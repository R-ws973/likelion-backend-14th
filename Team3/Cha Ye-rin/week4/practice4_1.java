import java.util.Scanner;

public class practice4_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("학생 수를 입력해주세요.");
    int student_number = sc.nextInt();

    int[] scores = new int[student_number];
    for (int i=0; i<student_number; i++) {
      System.out.println(i+1 + "번째 학생의 점수를 입력해주세요.");
      scores[i] = sc.nextInt();
    }

    int total_score = 0;
    for (int i=0; i<student_number; i++) {
      total_score += scores[i];
    }
    System.out.println("전체 점수를 출력합니다: " + total_score);

    float mean_score = 0;
    mean_score = (float) total_score / student_number ;
    System.out.println("평균 점수를 출력합니다: " + mean_score);

    int top_score = 0;
    for (int i=0; i<student_number; i++) {
      if (top_score < scores[i]) {
        top_score = scores[i];
      }
    }
    System.out.println("최고 점수를 출력합니다: " + top_score);

  }
}
