package part3;

public class EvenOddSeparation {
    public static void main(String[] args) {
        int[] arr = {12, 3, 22, 44, 5, 9, 8, 2, 11, 5};

        // Separate even numbers on the left and odd numbers on the right
        int[] result = rearrangeEvenOdd(arr);

        // Print the rearranged array
        System.out.print("Rearranged Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] rearrangeEvenOdd(int[] arr) {
        // Create a new array to hold the rearranged values
        int[] result = new int[arr.length];
        int left = 0;  // Pointer for the left side (even numbers)
        int right = arr.length - 1;  // Pointer for the right side (odd numbers)

        // Loop through the original array and rearrange the numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                result[left++] = num;  // Even numbers go to the left side
            } else {
                result[right--] = num;  // Odd numbers go to the right side
            }
        }

        return result;
    }
}
/**
 * 
  public class EvenOddSeparation {
    public static void main(String[] args) {
        int[] arr = {12, 3, 22, 44, 5, 9, 8, 2, 11, 5};

        // Call the function to rearrange the array
        rearrangeEvenOdd(arr);

        // Print the rearranged array
        System.out.print("Rearranged Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeEvenOdd(int[] arr) {
        int left = 0;  // Pointer for even numbers
        int right = arr.length - 1;  // Pointer for odd numbers

        while (left < right) {
            // Move left pointer if it's already even
            if (arr[left] % 2 == 0) {
                left++;
            }
            // Move right pointer if it's already odd
            else if (arr[right] % 2 != 0) {
                right--;
            }
            // Swap if left is odd and right is even
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}

 * 
 */

