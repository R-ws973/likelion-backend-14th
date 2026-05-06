import java.util.Scanner;

/**
 * 문제 1. 기본 계산 프로그램 (기초)
 */
public class Problem1_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("\n=== 연산 결과 ===");
        System.out.println("덧셈: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("뺄셈: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("곱셈: " + num1 + " × " + num2 + " = " + product);
        System.out.println("나눗셈: " + num1 + " / " + num2 + " = " + quotient);

        scanner.close();
    }
}