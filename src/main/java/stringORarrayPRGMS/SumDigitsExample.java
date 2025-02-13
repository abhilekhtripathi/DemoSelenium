package stringORarrayPRGMS;

public class SumDigitsExample {

	public static void main(String[] args) {
        // Declare the number whose sum of digits needs to be calculated
        int num = 1238;

        // Initialize the variable to store the sum of all digits
        int sum = 0;

        // Run a while loop until num becomes 0
        while (num != 0) {
            int rem = num % 10; // Extract the last digit of num
            sum = sum + rem;    // Add the last digit to sum
            num = num / 10;     // Remove the last digit from num
        }

        // Print the sum of digits
        System.out.println("Sum of all digits: " + sum);
    }
}