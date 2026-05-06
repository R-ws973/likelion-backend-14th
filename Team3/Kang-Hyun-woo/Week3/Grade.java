package Week3;


import java.util.Scanner;

public class Grade {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String grade;

        System.out.print("입력: ");
        int score = input.nextInt();
        input.nextLine();

        if(score > 100 || score < 0) {
            System.out.println("숫자 에러, 종료");
            return;
        }


        if(score >= 90)
            grade = "A";
        else if (score >= 80)
            grade = "B";
        else if (score >= 70)
            grade = "C";
        else
            grade = "D";

        System.out.println("Score: "+score+" Grade: "+grade);


    }
}
