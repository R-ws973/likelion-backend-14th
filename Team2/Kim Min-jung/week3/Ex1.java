package week3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int plus = num1 + num2;
        System.out.println("plus = " + plus);
        int minus = num1 - num2;
        System.out.println("minus = " + minus);
        int multiple = num1 * num2;
        System.out.println("multiple = " + multiple);
        int divide = num1 / num2;
        System.out.println("divide = " + divide);
    }
}
