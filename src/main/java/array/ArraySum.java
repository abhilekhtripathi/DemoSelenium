package array;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 4, 5};
        int sum = 0; // Initialize sum to 0
        
        // Loop through the array
        for (int num : arr) {
            sum += num; // Add each element to sum
        }
        
        // Print the sum
        System.out.println("Sum of array elements: " + sum);
    }
}