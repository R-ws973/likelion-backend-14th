package homework1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    System.out.println("합계 : "  + (n + m));
    System.out.println("뺼셈 : " + (n - m));
    System.out.println("곱셈 : " + n * m);
    System.out.println("나눗셈 : " +(int) n / (int) m);

  }
}
