import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] scores = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 학생 점수: ");
            scores[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = scores[0];

        for (int i = 0; i < count; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        double average = (double) sum / count;

        System.out.println("\n전체 점수:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생: " + scores[i] + "점");
        }

        System.out.println("\n평균 점수: " + average);
        System.out.println("최고 점수: " + max);

        scanner.close();
    }
}
