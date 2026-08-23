import java.util.*;

class Solution {
    public String sortSentence(String sentence) {

        String[] arr = sentence.split(" ");

        Map<Integer, String> map = new HashMap<>();

        for (String str : arr) {

            String[] parts = str.split("(?=\\d)");

            String text = parts[0];
            int number = Integer.parseInt(parts[1]);

            map.put(number, text);
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= map.size(); i++) {
            result.append(map.get(i)).append(" ");
        }

        return result.toString().trim();
    }
}