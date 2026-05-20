import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        grade();
//        strings();
//        calculate();
        if(discrimination()){
            System.out.println("홀");
        }else{
            System.out.println("짝");
        }
    }

    public static void grade(){

        System.out.print("학생수를 입력하세요: ");
        int num = sc.nextInt();

        int[] array = new int[num];
        int sum = 0;
        int best = 0;
        for(int i = 0; i < num; i++){
            System.out.print((i+1) + "번의 점수를 입력하세요: ");
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < num; i++){
            sum+=array[i];
            best = Math.max(best, array[i]);
        }

        System.out.println("점수의 합계는: " + sum);
        System.out.println("점수의 평균은: " + String.format("%.2f", (float)sum/num));
        System.out.println("점수의 최고점은: " + best);

    }

    public static void strings(){

        System.out.print("문장을 입력하세요: ");
        String s = sc.nextLine();

        String[] ss = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : ss) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }

    }

    public static void calculate(){

        System.out.print("첫번째 수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두번째 수를 입력하세요(단, 첫번째보다 작아야합니다.): ");
        int num2 = sc.nextInt();

        System.out.println("덧셈: " + add(num1, num2));
        System.out.println("뺄셈: " + sub(num1, num2));
        System.out.println("곱셈: " + mul(num1, num2));
        System.out.println("나눗셈: " + div(num1, num2));

    }

    public static int add(int n, int m) {
        return n+m;
    }
    public static int sub(int n, int m) {
        return n-m;
    }
    public static int mul(int n, int m) {
        return n*m;
    }
    public static int div(int n, int m) {
        return n/m;
    }



    public static boolean discrimination(){

        boolean result = true;
        int n = sc.nextInt();
        if(n % 2 == 0) result = false;
        return result;
    }

}
