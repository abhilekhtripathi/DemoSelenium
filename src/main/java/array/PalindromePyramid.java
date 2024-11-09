package array;

public class PalindromePyramid {
    public static void main(String[] args) {
        int rows = 5;

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

            // Move to the next line after each row
            System.out.println();
        }
    }
}
