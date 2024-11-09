package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 23, 3, 4, 5};
  
        int start = 0, end = arr.length - 1; // Initialize two pointers: start and end
        
        // Loop until start is less than end
        while (start < end) {
            int temp = arr[start]; // Temporary variable to hold the start value
            arr[start] = arr[end]; // Swap the start and end values
            arr[end] = temp; // Complete the swap
            start++; // Move start pointer forward
            end--; // Move end pointer backward
        }
        
        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

