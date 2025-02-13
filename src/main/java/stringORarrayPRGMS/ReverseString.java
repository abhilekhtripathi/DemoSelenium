package stringORarrayPRGMS;

public class ReverseString {
	public static void main(String[] args) {
		String str = "madam";
		String reversed = "";

// Loop through the string in reverse order
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed = reversed +  str.charAt(i); // Append each character to the reversed string
		}

		System.out.println("Reversed String: " + reversed);
		
		if (str.equalsIgnoreCase(reversed)) {
			System.out.println("the string is palindrome");
		}
		
		else {
			System.out.println("the string is not palindrome");
		}
	}
	
}