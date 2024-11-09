

import java.util.Arrays;

public class RemoveDuplicatesWithUsingHashset {
	public static void main(String[] args) {
		// Given array
		int[] a = { 11, 2, 33, 3, 4, 6, 6, 7, 8, 9, 9 };

		// Sort the array to make it easier to remove duplicates
		Arrays.sort(a);

		// Temporary array to store unique elements
		int[] temp = new int[a.length];
		int j = 0;

		// Loop through the sorted array and store unique elements in temp
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}
		// Add the last element as it wasn't compared in the loop
		temp[j++] = a[a.length - 1];

		// Create a new array with the correct size for unique elements
		int[] result = new int[j];
		for (int i = 0; i < j; i++) {
			result[i] = temp[i];
		}

		// Print the array without duplicates
		System.out.println("Array without duplicates: " + Arrays.toString(result));
	}
}
