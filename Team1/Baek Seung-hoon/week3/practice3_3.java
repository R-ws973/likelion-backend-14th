import java.util.Scanner;
public class practice3_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int student_num;
        float sum = 0;
        System.out.println("학생 수 입력하시오.");
        student_num = scanner.nextInt();
        scanner.nextLine();

        float[] score = new float[student_num];

        for(int i = 0; i < student_num; i++){
            System.out.println((i+1) + "번째 학생의 점수를 입력하시오.");
            score[i] = scanner.nextFloat();
            scanner.nextLine();
            sum += score[i];
        }

        System.out.printf("전체 평균 점수: %.1f",(sum / student_num));


    }
}

