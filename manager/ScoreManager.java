import java.util.Scanner;

public class ScoreManager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 학생 수 입력
    System.out.print("학생 수를 입력하세요: ");
    int n = sc.nextInt();

    // 학생 점수를 저장할 배열 생성
    int[] scores = new int[n];

    int sum = 0;  // 총점 저장 변수
    int max = 0;  // 최고 점수 저장 변수

    // 학생 수만큼 반복
    for (int i = 0; i < n; i++) {
      System.out.print((i + 1) + "번째 학생 점수 입력: ");
      scores[i] = sc.nextInt();  // 배열에 점수 저장

      sum += scores[i];  // 총점 누적

      // 최고 점수 비교
      if (i == 0 || scores[i] > max) {
        max = scores[i];
      }
    }

    // 평균 계산 (소수점 위해 형변환)
    double avg = (double) sum / n;

    // 결과 출력
    System.out.println("전체 점수: " + sum);
    System.out.println("평균 점수: " + avg);
    System.out.println("최고 점수: " + max);

    sc.close(); // 입력 종료
  }
}