package week4.homework4;

import java.util.Scanner;

public class NumberChecker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요 : ");
    int index = sc.nextInt();
    if(isEven(index)){
      System.out.println("짝수입니다1");
    }else{
      System.out.println("홀수입니다");
    }
  }
   public static boolean isEven(int i){
      if(i%2==0){
        return true;
      }
      return false;
   }
}
