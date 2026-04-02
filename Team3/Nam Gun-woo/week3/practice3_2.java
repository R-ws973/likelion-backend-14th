import java.util.Scanner;

public class practice3_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();

    if (0 > num || num > 100) {
        System.out.println("잘못된 입력입니다");
        System.exit(0);
    }

    if(num>=90){
      System.out.println("당신은 A");
    } else if(num>=80){
      System.out.println("당신은 B");
    } else if(num>=70){
      System.out.println("당신은 C");
    } else{
      System.out.println("넌 그냥 D");

    }
  }
}
