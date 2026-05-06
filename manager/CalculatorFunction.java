import java.util.Scanner;

public class CalculatorFunction {

  // 덧셈 함수
  public static int add(int a, int b) {
    return a + b;  // 결과 반환
  }

  // 뺄셈 함수
  public static int sub(int a, int b) {
    return a - b;
  }

  // 곱셈 함수
  public static int mul(int a, int b) {
    return a * b;
  }

  // 나눗셈 함수 (소수점 위해 double)
  public static double div(int a, int b) {
    return (double) a / b;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 두 수 입력
    System.out.print("첫 번째 정수 입력: ");
    int a = sc.nextInt();

    System.out.print("두 번째 정수 입력: ");
    int b = sc.nextInt();

    // 함수 호출하여 결과 출력
    System.out.println("덧셈: " + add(a, b));
    System.out.println("뺄셈: " + sub(a, b));
    System.out.println("곱셈: " + mul(a, b));

    // 0으로 나누기 방지
    if (b != 0) {
      System.out.println("나눗셈: " + div(a, b));
    } else {
      System.out.println("나눗셈: 0으로 나눌 수 없습니다.");
    }

    sc.close();
  }
}