package part1;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello World";
		String reversed = "";

// Loop through the string in reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed +  str.charAt(i); // Append each character to the reversed string
		}

		System.out.println("Reversed String: " + reversed);
	}
}