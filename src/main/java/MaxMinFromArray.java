

public class MaxMinFromArray {
	public static void main(String[] args) {
		int[] a = { 12, 9, 88, 8, 23, 22, 733, 0, 23, -1 };

		// Initialize max and min with the first element of the array
		int max = a[0];
		int min = a[0];

		// Loop through the array to find the max and min values
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i]; // Update max if current element is greater
			}
			if (a[i] < min) {
				min = a[i]; // Update min if current element is smaller
			}
		}
		System.out.println("Maximum number: " + max);
		System.out.println("Minimum number: " + min);
	}
}
