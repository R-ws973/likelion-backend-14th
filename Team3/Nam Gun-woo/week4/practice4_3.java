import java.util.Scanner;

public class practice4_3 {
  public static int plus(int num1, int num2){
    return (num1 + num2);
  }

  public static int minus(int num1, int num2){
    return (num1 - num2);
  }

  public static int multiply(int num1, int num2){
    return (num1 * num2);
  }

  public static int division(int num1, int num2){
    return (num1 / num2);
  }

  public static void main(String[] args) {
    int num1;
    int num2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("첫번째 정수 입력: ");
    num1 = scanner.nextInt();
    scanner.nextLine();
    System.out.print("두번째 정수 입력: ");
    num2 = scanner.nextInt();
    System.out.println("덧셈 결과: "+plus(num1, num2));
    System.out.println("뺄셈 결과: "+minus(num1, num2));
    System.out.println("곱셈 결과: "+multiply(num1, num2));
    System.out.println("나눗셈 결과: "+division(num1, num2));
  }
}
