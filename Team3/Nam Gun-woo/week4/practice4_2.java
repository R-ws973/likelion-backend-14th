import java.util.HashMap;
import java.util.Scanner;

public class practice4_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap();
    System.out.print("문장을 입력하시오: ");
    String str = scanner.nextLine();
    String[] word = str.split(" ");

    for(int i=0; i<word.length;i++){
      if(map.containsKey(word[i])){
        map.put(word[i],map.get(word[i])+1);
      } else{
        map.put(word[i], 1);
      }
    }

    for(String key: map.keySet()){
      System.out.println(key+"는 "+map.get(key)+"개입니다.");
    }

  }
}
