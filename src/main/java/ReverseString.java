

public class ReverseString {

	public static void main(String[] args) {
		String s = "abhiekh is QA team for the saffire";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println("reverse: " + sb.toString());
		

	}

}
// do it with without stringbuilder/buffre class// reverse word in the same place
/* public class ReverseString {
public static void main(String[] args) {
String str = "Hello World";
String reversed = "";

// Loop through the string in reverse order
for (int i = str.length() - 1; i >= 0; i--) {
    reversed += str.charAt(i); // Append each character to the reversed string
}

System.out.println("Reversed String: " + reversed);
}
}
*/