package stringORarrayPRGMS;
public class DuplicateCharsInStringExample {

	public static void main(String[] args) {
        String s = "abhilekh abhilekh testing automation";
        char[] s1 = s.toCharArray();

        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < s1.length; i++) {
            int count = 1;

            // Skip already processed characters
            if (s1[i] == ' ') {// Ignore spaces
                continue;
            }

            for (int j = i + 1; j < s1.length; j++) {
                if (s1[i] == s1[j]) {
                    count++;
                    s1[j] = '\0'; // Mark duplicate character as processed
                }
            }

            // Print the character and its count if it's a duplicate
            if (count > 1 && s1[i] != '\0') {
                System.out.println(s1[i] + " >> " + count);
            }
        }

	}

}
