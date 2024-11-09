package StringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		String s = "racecar";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if (s.equalsIgnoreCase(rev)) {

			System.out.println("the string is palindrome ");

		} else {
			System.out.println("the string is palindrome ");
		}
	}
}
