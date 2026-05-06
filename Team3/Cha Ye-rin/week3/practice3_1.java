import java.util.Scanner;

public class practice3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("두 개의 정수를 입력해주세요.");
    int first_int = sc.nextInt();
    int second_int = sc.nextInt();

    System.out.println("덧셈 결과: " + (first_int + second_int));
    System.out.println("뺄셈 결과: " + (first_int - second_int));
    System.out.println("곱셈 결과: " + (first_int * second_int));
    System.out.println("나눗셈 결과: " + (first_int / second_int));
  }
}