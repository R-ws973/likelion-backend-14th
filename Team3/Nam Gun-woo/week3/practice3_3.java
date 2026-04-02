import java.util.Scanner;

public class practice3_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int student = scanner.nextInt();
    double result = 0;
    int n = 0;
    int num[] = new int[student];
    for(int i = 0; i<student; i++){
      System.out.print(i+1+" 번째 학생의 점수: ");
      num[i] = scanner.nextInt();
      result += num[i];
      n++;
    }
    System.out.println("전체 평균은 "+(result/n)+"입니다");

  }
}
