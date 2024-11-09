package array;

public class ArraySorted {
	public static void main(String[] args) {
		int[] arr = { 6, 2, 3, 4, 5 };

		if (isSorted(arr)) {
			System.out.println("The array is sorted in ascending order.");
		} else {
			System.out.println("The array is not sorted in ascending order.");
		}

	}

	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false; // If any element is greater than the next, it's not sorted
			}
		}
		return true; // If no elements violate the order, it's sorted
	}
}
