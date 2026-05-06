package Week3;

import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        int a = input.nextInt();
        input.nextLine(); // 공백 제거용
        int b = input.nextInt();
        input.nextLine(); // 공백 제거용

        System.out.println("덧셈: "+(a+b));
        System.out.println("뺄셈: "+ (a-b));
        System.out.println("곱셈: "+(a*b));
        System.out.println("나눗셈(정수 나눗셈): "+(a/b));
    }
}
