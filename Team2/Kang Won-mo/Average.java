import java.util.Scanner;

public class Average {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("학생 수를 입력하세요: ");
    int studentCount = sc.nextInt();

    int[] scores = new int[studentCount];
    int sum = 0;

    for (int i = 0; i < studentCount; i++) {
      System.out.print((i + 1) + "번째 학생 점수 입력: ");
      scores[i] = sc.nextInt();
      sum += scores[i];
    }

    double average = (double) sum / studentCount;

    System.out.println("전체 평균: " + average);

    sc.close();
  }
}