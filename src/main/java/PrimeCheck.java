

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the limit up to which to find prime numbers
        System.out.print("Enter the limit to find prime numbers: ");
        int limit = scanner.nextInt();
        
        // Loop through numbers from 2 to the limit
        System.out.println("Prime numbers up to " + limit + " are: ");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
