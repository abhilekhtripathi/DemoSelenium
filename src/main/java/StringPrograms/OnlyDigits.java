package StringPrograms;

public class OnlyDigits {
    public static void main(String[] args) {
        String str = "12345"; // Input string to check

        // Check if the string consists of only digits
        boolean isNumeric = str.matches("\\d+"); // Regular expression to check for digits

        // Print whether the string contains only digits
        if (isNumeric) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains other characters.");
        }
    }
}

