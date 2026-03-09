package map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        // 코드 작성
        String[] words = text.split(" ");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        for (String word : words) {
            Integer count = wordFrequencyMap.get(word);
            if (count == null) {
                count = 0;
            }
            count ++;
            wordFrequencyMap.put(word, count);
        }

        System.out.println(wordFrequencyMap);
    }
}
