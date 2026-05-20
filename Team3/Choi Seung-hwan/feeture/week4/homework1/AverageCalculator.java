package week4.homework1;

import java.util.Scanner;

public class AverageCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    System.out.print("학생 수 : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      System.out.print("점수 : ");
      arr[i] += sc.nextInt();
      if(max < arr[i]){
        max = arr[i];
      }
      sum += arr[i];
    }
    System.out.println("최대 점수 : "+max);
    System.out.println("총 합 : "+sum);
    System.out.printf("평균 : %.2f ",(float) sum/(float) n);

  }
}
