package array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 77, 1, 19, 5};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE; // Initialize both to the smallest possible value
        
        // Loop through the array
        for (int num : arr) {
            if (num > first) { 
                second = first; // If current element is greater than first, update second
                first = num; // Update first with the current element
            } else if (num > second && num != first) {
                second = num; // Update second if current element is greater than second
            }
        }
        
        // Print the second largest element
        System.out.println("Second largest element: " + second);
    }
}
