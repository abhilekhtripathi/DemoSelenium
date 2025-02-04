
import java.util.Scanner;

public class PlindromeNumber {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Number:");

	//	int no = sc.nextInt();
		 String s = "abababcef";
	        
	        // Iterate over each character of the string
	        for (int i = 0; i < s.length(); i++) {
	            // If the character appears only once in the string, print it
	            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
	                System.out.print(s.charAt(i)+ " ");
	            }
	        }
	}

}
