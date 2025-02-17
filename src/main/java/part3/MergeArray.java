package part3;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int[] first = { 1, 2, 333 };
		int[] second = { 40, 5, 6 };

		int[] merge = new int[first.length + second.length];

		int index = 0;
		for (int num : first) {
			merge[index++] = num;
		}
		for (int num : second) {
			merge[index++] = num;
		}

		System.out.println("Merged Array: " + Arrays.toString(merge));
	}
}
