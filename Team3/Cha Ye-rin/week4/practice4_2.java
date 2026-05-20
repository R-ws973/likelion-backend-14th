import java.util.HashMap;
import java.util.Scanner;

public class practice4_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("빈도수를 분석할 문장을 입력해주세요.");
    String input_sentence = input.nextLine();

    String[] words = input_sentence.split(" ");

    HashMap<String, Integer> word_frequency = new HashMap<>();

    for (String word : words) {
      if (word_frequency.containsKey(word)) {
        word_frequency.put(word, word_frequency.get(word) + 1);
      } else {
        word_frequency.put(word, 1);
      }
    }

    System.out.println("단어 빈도수:");
    for (String key : word_frequency.keySet()) {
      System.out.println(key + " : " + word_frequency.get(key));
    }

    input.close();
  }
}
