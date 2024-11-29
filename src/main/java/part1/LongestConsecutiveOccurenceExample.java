package part1;

public class LongestConsecutiveOccurenceExample {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 25, 5,6, 7, 8, 9, 2, 3, 10 };// jo number serial se chl rhe hai usko bolte h 

		int count = 0;
		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 == arr[i + 1]) {
				count++;
			} else {
				count = 0;
			}

			max = Math.max(max, count + 1);
		}
		System.out.println(max);
	}

}
