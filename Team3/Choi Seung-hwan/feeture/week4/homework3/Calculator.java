package week4.homework3;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("정수를 입력하세요 : ");
      int num1 = sc.nextInt();
      System.out.print("정수를 입력하세요 : ");
      int num2 = sc.nextInt();

      sum(num1, num2);
      minus(num1, num2);
      multiply(num1, num2);
      divide(num1, num2);

  }
  public static void sum(int a, int b){
    System.out.println(a+b);
  }
  public static void minus(int a, int b){
    System.out.println(a - b);
  }
  public static void multiply(int a, int b){
    System.out.println(a * b);
  }
  public static void divide(int a, int b){
    System.out.println((float) a / (float) b);
  }
}
