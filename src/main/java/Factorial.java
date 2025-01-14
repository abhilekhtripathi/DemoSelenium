
public class Factorial {

	public static void main(String[] args) {
		// System.out.println("dfghjk");
		// !5 = 5x4x3x2x1 = 120
		// !4 = 24
		// !0 = 1

		// !3=3*2*1

		// Scanner sc = new Scanner(System.in);

		int no = 9;
		int fact = 1;

		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}

		System.out.println(fact);

	}

}
