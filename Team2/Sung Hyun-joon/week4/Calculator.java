import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int b = scanner.nextInt();

        System.out.println("\n덧셈 결과: " + add(a, b));
        System.out.println("뺄셈 결과: " + subtract(a, b));
        System.out.println("곱셈 결과: " + multiply(a, b));
        System.out.println("나눗셈 결과: " + divide(a, b));

        scanner.close();
    }
}
