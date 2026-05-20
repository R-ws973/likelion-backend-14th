package Week4;
import java.util.*;
public class WordCounter {
    public static void main(String[] args) {
        Map<String,Integer> wordCount = new HashMap();

        String mockSentence = "워드카운터는 웹 기반 도구로, 문서의 총 단어 수, 문자 수, 그리고 문장의 개수를 실시간으로 계산해 주는 편리한 기능입니다. 이 도구는 작가, 학생, 마케터가 글의 분량을 조절하거나 보고서를 작성할 때 정확한 통계를 제공하여 문서를 효율적으로 관리할 수 있도록 돕습니다.";

        System.out.print("문장입력: ");
        Scanner input = new Scanner(System.in);


//        String sentence = input.nextLine();
        String testSentence = mockSentence;
        for ( String word: testSentence.split(" ")) {
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        System.out.println(wordCount);
    }
}
