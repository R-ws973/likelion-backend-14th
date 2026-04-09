import java.util.Scanner;
import java.util.HashMap;
/*public class week4{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("학생수를 입력: ");
    int n=sc.nextInt();
    int[] score= new int[n];
    int sum=0, max=0;

    for(int i=0; i<n; i++){
      System.out.print("점수 입력: ");
      score[i]= sc.nextInt();
      sum+=score[i];
      if(score[i]>max){
        max=score[i];
      }
    }
    float avg=(float)sum/n;
    System.out.println("전체점수: "+sum);
    System.out.println("평균: " +avg);
    System.out.println("최고점수: "+max);
  }
}*/



/*public class week4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("문장을 입력하세요:");
    String sentence = sc.nextLine();
    String[] words = sentence.split(" ");
    HashMap<String, Integer> map = new HashMap<>();
    for(int i = 0; i < words.length; i++){
      String word = words[i];
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    for(String key : map.keySet()){
      System.out.println(key + " : " + map.get(key));
    }
  }
}*/

/*public class week4 {
  public static int add(int a, int b){
    return a + b;
  }

  public static int sub(int a, int b){
    return a - b;
  }

  public static int mul(int a, int b){
    return a * b;
  }

  public static int div(int a, int b){
    return a / b;
  }

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수 입력: ");
    int x = sc.nextInt();

    System.out.print("두 번째 정수 입력: ");
    int y = sc.nextInt();

    System.out.println("덧셈: " + add(x,y));
    System.out.println("뺄셈: " + sub(x,y));
    System.out.println("곱셈: " + mul(x,y));
    System.out.println("나눗셈: " + div(x,y));
  }
}*/
public class week4{
  public static boolean isEven(int num){
    if(num % 2 == 0){
      return true;
    }
    else{
      return false;
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력하세요: ");
    int n = sc.nextInt();
    if(isEven(n)){
      System.out.println("짝수입니다.");
    }
    else{
      System.out.println("홀수입니다.");
    }
  }
}

