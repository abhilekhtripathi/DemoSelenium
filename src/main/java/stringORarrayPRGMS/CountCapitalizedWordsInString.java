package stringORarrayPRGMS;

public class CountCapitalizedWordsInString {
	public static void main(String[] args) {
		
		String s = "RahuLShetty AcAdemy"; // Input string
        int counter = 0; // To count uppercase letters

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                counter++;
                
            }
        }

        // Output the result
        //System.out.println("The string is: " + s);
        //System.out.println("Number of uppercase letters: " + counter);
        System.out.println(counter);
	}

}
