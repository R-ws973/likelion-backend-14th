package week1;

public class Ex5 {
    public static void main(String[] args) {
        String name = "민정";
        int age = 20;

        System.out.println("name = " + name);
        System.out.println("age = " + age);

        if (age > 20) {
            System.out.println("성인");

        } else {
            System.out.println("미성년자");

        }

        for (int i = 0; i <= 3; i++) {
            System.out.println(name+"님 환영합니다!"+i+"회차");
        }
    }
}
