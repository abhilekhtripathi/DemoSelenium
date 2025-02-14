package stringAndarraysLogics;

public class FindCharSpclNumberFromString

{

	public static void main(String[] args) {
		String data = "a1b2c#";// एक स्ट्रिंग जिसमें अल्फाबेट, नंबर और स्पेशल कैरेक्टर है

		for (int i = 0; i < data.length(); i++) { // हर कैरेक्टर को एक-एक करके पढ़ते हैं
			char ch = data.charAt(i); // मौजूदा कैरेक्टर को लेते हैं

			if (Character.isLetter(ch)) {  // चेक करते हैं कि कैरेक्टर अल्फाबेट है या नहीं
				System.out.println(ch + " is an Alphabet");
			} else if (Character.isDigit(ch)) {  // चेक करते हैं कि कैरेक्टर नंबर है या नहीं
				System.out.println(ch + " is a Digit");
			} else {        // अगर ऊपर दोनों नहीं है तो इसे स्पेशल कैरेक्टर मानते हैं
				System.out.println(ch + " is a Special Character");
			}
		}
	}
}
