import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문장을 입력하세요: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("\n단어 빈도수:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key) + "번");
        }

        scanner.close();
    }
}
