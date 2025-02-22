package stringORarrayPRGMS;

public class StringReverseSamePlace {
	void taste() {
		System.out.print("Sweet");
	}

	public static void main(String[] args) {
		String s = "My name is ayush";

		String[] s1 = s.split(" ");
		String newString = "";

		for (String str : s1) {
			for (int i = str.length() - 1; i >= 0; i--) {
				newString = newString + str.charAt(i);
			}
			newString = newString + " ";
		}
		System.out.println(newString.strip());

	}
}
