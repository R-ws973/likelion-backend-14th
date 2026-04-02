public class practice2_3{
  public static void main(String[] args) {

    String name = "건우";
    int age = 23;

    System.out.println("이름: "+name);
    System.out.println("나이: "+age);

    if(age>=20){
      System.out.println("성인입니다");
    }else{
      System.out.println("미성년자입니다");
    }

    for(int i=1;i<=3; i++){
      System.out.println(name+"님 환영합니다! "+i+"회차");
    }
  }
}