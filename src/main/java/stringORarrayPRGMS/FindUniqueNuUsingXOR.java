package stringORarrayPRGMS;

public class FindUniqueNuUsingXOR {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 4, 1, 3, 2 };
		int unique = 0;

		for (int num : nums) {
			unique ^= num; // XOR each number
		}

		System.out.println("Unique number: " + unique);
	}
}
