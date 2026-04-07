import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
  Scanner sc = new Scanner(System.in);

  public void calculate(){
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
  }
  public void grade(){
    int grade = sc.nextInt();

    if(grade > 100 || grade < 0){
      System.out.println("점수를 잘못 입력하셨습니다.");
      return;
    }

    switch(grade/10){
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      default:
        System.out.println("D");
    }
  }

  public void studentGrade(){

    int num = sc.nextInt();
    ArrayList<Integer> array = new ArrayList<Integer>();

    double totalScore = 0;
    for(int i = 0; i < num; i++){
      array.add(sc.nextInt());
      totalScore+=array.get(i);
    }
    System.out.println(totalScore/num);
  }
}
