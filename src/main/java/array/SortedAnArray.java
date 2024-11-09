package array;

import java.util.Arrays;

public class SortedAnArray {
    public static void main(String[] args) {
        int[] arr = { 55, 45, 3, 2, 10 };
        
        // Ascending Order
        Arrays.sort(arr);
        System.out.println("Array in Ascending Order: " + Arrays.toString(arr));
        
        // Descending Order by reversing the sorted array
        int[] descArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            descArr[i] = arr[arr.length - 1 - i];
        }
        
        System.out.println("Array in Descending Order: " + Arrays.toString(descArr));
    }
}

