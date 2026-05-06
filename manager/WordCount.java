import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 문장 입력
    System.out.print("문장을 입력하세요: ");
    String sentence = sc.nextLine();

    // 공백 기준으로 단어 분리
    String[] words = sentence.split(" ");

    // 단어와 개수를 저장할 Map 생성
    HashMap<String, Integer> map = new HashMap<>();

    // 단어 배열 반복
    for (String word : words) {

      // 이미 존재하는 단어라면
      if (map.containsKey(word)) {
        // 기존 값 +1
        map.put(word, map.get(word) + 1);
      } else {
        // 처음 나온 단어라면 1로 저장
        map.put(word, 1);
      }
    }

    // 결과 출력
    System.out.println("단어 빈도수:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      // key: 단어, value: 개수
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    sc.close();
  }
}