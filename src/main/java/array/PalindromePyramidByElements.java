package array;
import java.util.Scanner;

public class PalindromePyramidByElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of elements for the palindrome pyramid: ");
        int totalElements = scanner.nextInt();

        int rows = 0;
        int sum = 0;

        // Calculate the number of rows required to reach the total elements
        while (sum < totalElements) {
            rows++;
            sum += rows;  // Accumulate the elements in each row
        }

        System.out.println("Height of the palindrome pyramid: " + rows + " rows");

        // Optional: Print the palindrome pyramid up to the calculated height
        printPalindromePyramid(rows);
    }

    public static void printPalindromePyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces for alignment
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print the ascending part of the palindrome
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            // Print the descending part of the palindrome
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
