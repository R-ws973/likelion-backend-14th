import java.util.Scanner;

public class practice4_4 {

  static boolean check(int num){
    return num%2 ==0;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수를 입력: ");
    int num = scanner.nextInt();

    if(check(num)==true){
      System.out.println(num+"는 짝수입니다.");
    }else{
      System.out.println(num+"는 홀수입니다. ");
    }
  }
}
