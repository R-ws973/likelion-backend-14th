import java.util.Scanner;

/**
 * 문제 2. 등급 판별 프로그램 (조건문)
 */
public class Problem2_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요 (0~100): ");
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("잘못된 입력입니다. 0~100 사이의 점수를 입력하세요.");
        } else {
            char grade;

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            System.out.println("\n=== 등급 판별 결과 ===");
            System.out.println("점수: " + score);
            System.out.println("등급: " + grade);
        }

        scanner.close();
    }
}
