
import java.util.Scanner;

public class PlindromeNumber {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Number:");

	//	int no = sc.nextInt();
         int no = 3;
		int temp = no;
		int rev = 0;
		int rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {

			System.out.println(no + " No is plaindrome ");
		} else

			System.out.println(no + " Not a pialndrome");
	}

}
