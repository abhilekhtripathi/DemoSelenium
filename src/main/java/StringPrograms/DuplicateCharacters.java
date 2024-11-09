package StringPrograms;

import java.util.HashMap;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print characters with count > 1 (duplicates)
        System.out.println("Duplicate characters:");
        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + ": " + map.get(ch));
            }
        }
    }
}

