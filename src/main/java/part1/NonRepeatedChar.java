package part1;

public class NonRepeatedChar {
	public static void main(String[] args) {

		int[] arr = { 12, 324, 44, 44, 5, 6, 78 };

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}
		
		System.out.println(second);
	}
}