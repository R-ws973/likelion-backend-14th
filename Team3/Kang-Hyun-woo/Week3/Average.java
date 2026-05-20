package Week3;

import java.util.Scanner;

public class Average {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int[] scores;

        System.out.print("학생 수 입력: ");
        int studentNum = input.nextInt();
        input.nextLine();
        scores = new int[studentNum];

        for (int i=0; i<studentNum; i++) {
            System.out.print("점수 입력: ");
            scores[i] = input.nextInt();
            input.nextLine();
            sum = scores[i]+sum;
        }

        System.out.print("학생 점수: ");
        for(int score:scores)
            System.out.print(" "+score);
        System.out.print("\n");
        System.out.println("평균: "+(float)sum/studentNum+" 총합: "+sum);
    }
}
