package Week4;

import java.util.Scanner;

public class FindOddOrEven {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        num = input.nextInt();
        input.nextLine();
        if(isOdd(num))
            System.out.println("찍수입니다.");
        else
            System.out.println("홀수입니다.");

    }
    boolean isOdd (int num) {
        return num%2==0;
    }
}
