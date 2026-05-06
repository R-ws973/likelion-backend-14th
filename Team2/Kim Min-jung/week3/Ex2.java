package week3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your score : ");

        int score = sc.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("wrong score!");
            return;
        }

        char grade = switch (score/10) {
            case 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
        };

        System.out.println("grade = " + grade);

    }

}

