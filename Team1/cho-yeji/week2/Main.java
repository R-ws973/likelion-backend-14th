public class Main {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      System.out.println(i + "번째 출력");
    }
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        System.out.println(i + "는 짝수입니다.");
      } else {
        System.out.println(i + "는 홀수입니다.");
      }
    }

    System.out.println("Hello Java");

    String name = "예지";
    int age = 20;

    System.out.println("이름: " + name);
    System.out.println("나이: " + age);

    if(age >= 20){
      System.out.println("성인입니다.");
    }else {
      System.out.println("미성년자입니다.");
    }

    for(int i = 0; i < 3; i++){
      System.out.println(name + "님 환영합니다! " + (i+1) + "회차");
    }
  }
}
