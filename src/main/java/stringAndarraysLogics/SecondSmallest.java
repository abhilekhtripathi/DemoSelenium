package part2;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr = { 12, 2, 23, 33, 45, 5, 6 };
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < first) {

				second = first;
				first = num;
			} else if (num < second && num != first) {
				second = num;
			}
		}
		System.out.println(second);
	}

}
