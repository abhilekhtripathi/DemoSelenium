package array;

public class MoveZeroeslast {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 4, 0, 5};
        int index = 0; // Initialize index to place non-zero elements
        
        // Loop through the array
        for (int num : arr) {
            if (num != 0) { // If the element is non-zero
                arr[index++] = num; // Move it to the front
            }
        }
        
        // Fill the rest of the array with zeroes
        while (index < arr.length) {
            arr[index++] = 0;
        }
        
        // Print the modified array
        System.out.print("Array after moving zeroes: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

