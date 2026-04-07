import java.util.Scanner;

public class practice3_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.println("점수를 입력하시오. 범위(0~100)");

        while(true){
            score = scanner.nextInt();
            scanner.nextLine();
            if(score < 0 || score > 100){
                System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
                continue;
            }
            break;
        }

        if(score >= 90)
            System.out.println("A");
        else if (score < 90 && score >= 80)
            System.out.println("B");
        else if (score < 80 && score >= 70)
            System.out.println("C");
        else
            System.out.println("D");



    }
}
