package week3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("학생 수를 입력하십시오: ");
        int num = sc.nextInt();

        float sum = 0;
        System.out.println("모든 학생의 점수를 하나씩 입력하시오.");
        for (int i = 0; i < num; i++) {
            float[] scores = new float[num];
            scores[i] = sc.nextFloat();
            sum += scores[i];
        }

        float aver = sum / num;
        System.out.println("average = " + aver);
    }
}
