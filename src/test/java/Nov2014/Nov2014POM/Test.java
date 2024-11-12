package Nov2014.Nov2014POM;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");

		int nu = sc.nextInt();

		int temp = nu;
		int rev = 0;
		int rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rem + rev * 10;
			temp = temp / 10;

		}

		if (nu == rev) {
			System.out.println("the number is palindrome");
		} else {
			System.out.println("the number is  not palindrome ");
		}

	}
}
