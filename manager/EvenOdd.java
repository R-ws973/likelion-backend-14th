import java.util.Scanner;

public class EvenOdd {

  // 짝수인지 판별하는 함수 (true/false 반환)
  public static boolean isEven(int num) {
    return num % 2 == 0;  // 나머지가 0이면 짝수
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 정수 입력
    System.out.print("정수를 입력하세요: ");
    int num = sc.nextInt();

    // 함수 결과에 따라 출력
    if (isEven(num)) {
      System.out.println("짝수입니다.");
    } else {
      System.out.println("홀수입니다.");
    }

    sc.close();
  }
}