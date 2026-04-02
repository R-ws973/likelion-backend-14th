package homework3;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("학생 수 : ");
    int n = sc.nextInt();
    int[] m = new int[n];
    float sum = 0;
    for(int i=0;i<n;i++){
      System.out.print("점수 : ");
      m[i] = sc.nextInt();
      sum += m[i];
    }
    System.out.printf("평균 : %.1f",sum/n);
  }
}
