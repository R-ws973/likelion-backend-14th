package homework2;

import java.util.Scanner;

import static java.lang.System.exit;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("점수 : ");
    int n = sc.nextInt();
    if(n>100 || n<0){
      System.out.println("false");
      exit(0);
    }
    if(n>=90){
      System.out.println("A");
    }else if(n>=80){
      System.out.println("B");
    }else if(n>=70){
      System.out.println("C");
    }else{
      System.out.println("D");
    }
  }
}
