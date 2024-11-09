

public class ReverseStringWordsWithoutMethod {
    public static void main(String[] args) {
        // Given string
        String s = "abhiekh is QA team for the saffire";

        // Step 1: Convert the string to a character array and reverse the entire string
        char[] charArray = s.toCharArray();
        reverse(charArray, 0, charArray.length - 1);

        // Step 2: Reverse each word in the reversed string
        int start = 0;
        for (int end = 0; end < charArray.length; end++) {
            if (charArray[end] == ' ') {
                reverse(charArray, start, end - 1);
                start = end + 1; // Move to the start of the next word
            }
        }
        // Reverse the last word (if there's no trailing space)
        reverse(charArray, start, charArray.length - 1);

        // Convert the final character array back to a string
        String reversedString = new String(charArray);

        // Print the final string with words in the same place but reversed
        System.out.println("Reversed words string: " + reversedString);
    }

    // Helper method to reverse a portion of the character array
    public static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
