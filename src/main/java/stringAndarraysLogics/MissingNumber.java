package part2;

public class MissingNumber {
    public static void main(String[] args) {
        // Define a sorted array with missing numbers
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 10, 12};

        // Print initial message for missing numbers
        System.out.print("Missing numbers: ");

        // Loop through the array, starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Calculate the difference between the current and previous element
            int diff = arr[i] - arr[i - 1];

            // If the difference is greater than 1, it means there are missing numbers
            for (int j = 1; j < diff; j++) {
                // Print each missing number between arr[i-1] and arr[i]
                System.out.print((arr[i - 1] + j) + " ");
            }
        }
    }
}


