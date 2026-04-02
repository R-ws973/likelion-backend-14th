import java.util.Scanner;

public class practice3_1{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    int plus = num1 + num2;
    int minus = num1 - num2;
    int multiply = num1 * num2;
    int division = num1 / num2;

    System.out.println("덧셈 결과: "+plus);
    System.out.println("뺄셈 결과: "+minus);
    System.out.println("곱셈 결과: "+multiply);
    System.out.println("나눗셈 결과: "+division);

  }
}