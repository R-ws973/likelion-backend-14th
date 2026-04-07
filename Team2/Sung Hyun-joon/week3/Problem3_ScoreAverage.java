import java.util.Scanner;

/**
 * 문제 3. 성적 입력 프로그램 (반복문)
 */
public class Problem3_ScoreAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        int[] scores = new int[studentCount];
        int sum = 0;

        for (int i = 0; i < studentCount; i++) {
            System.out.print((i + 1) + "번 학생 점수: ");
            scores[i] = scanner.nextInt();
            sum += scores[i];
        }

        double average = (double) sum / studentCount;

        System.out.println("\n=== 성적 평균 결과 ===");
        System.out.println("학생 수: " + studentCount);
        System.out.println("총점: " + sum);
        System.out.printf("평균: %.1f\n", average);

        scanner.close();
    }
}
