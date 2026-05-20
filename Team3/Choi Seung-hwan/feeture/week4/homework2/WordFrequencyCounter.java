package week4.homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();

    String[] words = string.split(" ");
    Map<Integer,String> map = new HashMap<>();

    for(int i = 0; i< words.length; i++){
      map.put(i, words[i]);
    }

    for(int i = 0; i< words.length; i++) {
      int count = 0;
      for(int j = 0; j< words.length; j++) {
        if(words[i].equals(map.get(j))){
          count++;
        }
      }
      System.out.println(words[i] + " : "+count);
    }
  }
}
