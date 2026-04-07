import java.util.Scanner;

public class practice3_1{
    public static void main(String[] args){
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 수 입력:");
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("두번째 수 입력:");
        b = scanner.nextInt();

        System.out.println("덧셈결과: " + (a+b));
        System.out.println("뺄셈결과: " + (a-b));
        System.out.println("곱셈결과: " + (a*b));
        System.out.println("나눗셈결과: " + (a/b));
    }
}
