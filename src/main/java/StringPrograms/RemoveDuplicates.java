package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>(); // Set to store unique characters
        
        // Add each character to the set (duplicates are automatically ignored)
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Build the string without duplicates
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        System.out.println("String after removing duplicates: " + result.toString());
    }
}

