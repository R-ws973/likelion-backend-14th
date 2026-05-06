import java.util.Scanner;

public class Problem3_Average {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("학생 수를 입력하세요: ");
    int count = sc.nextInt();

    int[] scores = new int[count];

    for (int i = 0; i < count; i++) {
      System.out.print((i + 1) + "번 학생의 점수를 입력하세요: ");
      scores[i] = sc.nextInt();
    }

    int total = 0;
    for (int i = 0; i < count; i++) {
      total += scores[i];
    }

    double average = (double) total / count;

    System.out.println("\n===== 성적 결과 =====");
    for (int i = 0; i < count; i++) {
      System.out.println((i + 1) + "번 학생: " + scores[i] + "점");
    }
    System.out.printf("전체 평균: %.2f점%n", average);

    sc.close();
  }
}