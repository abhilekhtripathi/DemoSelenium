package stringORarrayPRGMS;

public class LargestAndSmallest {

	public static void main(String[] args) {
		// Initialize the array
		int[] a = { 3, 5, 7, 2, 8, -6, 4, 10, -22, 15 };

		// Assume the first element is both the largest and smallest
		int largest = a[0];
		int smallest = a[0];

		// Traverse through the array
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			} else if (a[i] < smallest) {
				smallest = a[i];
			}
		}

		// Output the result
		System.out.println("Largest Number: " + largest);
		System.out.println("Smallest Number: " + smallest);

	}

}
