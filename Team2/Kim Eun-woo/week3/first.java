import java.util.Scanner;

public class Problem1_Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수를 입력하세요: ");
    int a = sc.nextInt();

    System.out.print("두 번째 정수를 입력하세요: ");
    int b = sc.nextInt();

    System.out.println("\n===== 계산 결과 =====");
    System.out.println(a + " + " + b + " = " + (a + b));
    System.out.println(a + " - " + b + " = " + (a - b));
    System.out.println(a + " * " + b + " = " + (a * b));

    if (b == 0) {
      System.out.println(a + " / " + b + " = 0으로 나눌 수 없습니다.");
    } else {
      System.out.println(a + " / " + b + " = " + (a / b));
    }

    sc.close();
  }
}