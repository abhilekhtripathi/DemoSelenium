package stringORarrayPRGMS;

public class NonRepeatedChar {
	public static void main(String[] args) {

		String s = "abababcef";

		// Iterate over each character of the string
		for (int i = 0; i < s.length(); i++) {
			// If the character appears only once in the string, print it
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				System.out.print(s.charAt(i) + " ");
			}
		}
	}
}