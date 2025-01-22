
package part2;

public class CompressString {
    public static void main(String[] args) {
        String input = "aabbbc";
        String output = "";
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                output += input.charAt(i - 1) + Integer.toString(count);
                count = 1;
            }
        }
        output += input.charAt(input.length() - 1) + Integer.toString(count); // For last character
        System.out.println(output); // Output: a2b3c3
    }
}