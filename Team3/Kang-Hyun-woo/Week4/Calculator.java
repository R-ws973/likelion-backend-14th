package Week4;

import java.util.*;

public class Calculator {
    void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;

        System.out.print("정수1 입력: ");
        x = input.nextInt();
        input.nextLine();
        System.out.print("정수2 입력: ");
        y = input.nextInt();
        input.nextLine();
        System.out.println("덧셈: "+plus(x,y));
        System.out.println("뺄셈: "+minus(x,y));
        System.out.println("곱셈: "+times(x,y));
        System.out.println("나눗셈: "+divide(x,y));


    }
    int plus(int x,int y) {
        return x+y;
    }
    int minus(int x,int y) {
        return x+y;
    }
    int times(int x,int y) {
        return x*y;
    }
    float divide(int x,int y) {
        return (float)x/y;
    }
}
