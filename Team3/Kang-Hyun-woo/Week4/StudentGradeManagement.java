package Week4;
import java.util.*;


public class StudentGradeManagement {
    Scanner input = new Scanner(System.in);
    int studentNum;
    int[] studentsGrade;

    public void run() {
        System.out.print("학생 수 :");
        studentNum = input.nextInt();
        input.nextLine();
        studentsGrade = new int[studentNum];
        for (int i=0; i < studentNum; i++ ) {
            System.out.print(i+1+". 학생 점수 :");
            studentsGrade[i] = input.nextInt();
            input.nextLine();
        }

        int sum=0,max=0, min = 999999;
        for(int i = 0; i < studentNum; i++) {

            sum = sum + studentsGrade[i];
        }

        float average = (float)sum/studentNum;
        System.out.println(average);
    }



}
