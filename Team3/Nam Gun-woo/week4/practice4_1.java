import java.util.Scanner;

public class practice4_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int total_result = 0;
    double average_result = 0;
    int max_result = 0;
    System.out.print("학생 수를 입력: ");
    int student = scanner.nextInt();
    scanner.nextLine();
    int[] num = new int[student];

    System.out.println("점수를 입력하시오 ");
    for(int i = 0; i<student;i++){
      num[i] = scanner.nextInt();
      scanner.nextLine();
      if(num[i]>=max_result){
        max_result = num[i];
      }
    }
    for(int j = 0; j<student;j++){
      total_result += num[j];
    }
    for(int k = 0; k<student;k++){
      average_result = total_result/student;
    }

    System.out.println("전체 점수: "+total_result);
    System.out.println("평균 점수: "+average_result);
    System.out.println("최고 점수: "+max_result);
  }
}

