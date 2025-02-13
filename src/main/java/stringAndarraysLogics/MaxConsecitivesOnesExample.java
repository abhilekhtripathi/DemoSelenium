package part2;

public class MaxConsecitivesOnesExample {

	static void findConsectiveOnes(int[] nums) {

		int count = 0;
		int max = 0;

		for (int i = 0; i < nums.length; i++) {
			while (i < nums.length && nums[i] == 1) {
				count++;
				i++;
			}

			if (max < count) {
				max = count;
			}

			count = 0;

		}
		System.out.println(max);
	}

	public static void main(String[] args) {

		int[] array = { 1, 1, 0, 0, 1, 1, 1, 0,0,0,0,0,0,0,0, 1, 1, 1, 1, 1 };
		findConsectiveOnes(array);

	}

}