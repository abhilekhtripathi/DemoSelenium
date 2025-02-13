package part2;

public class PrintNumWithoutUsingLoopExample {

	public static void main(String[] args) {
		printnum(1);

	}

	public static void printnum(int num) {
		if (num <= 100) {
			System.out.print(num + "  ");
			num++;
			printnum(num);

		}

	}
}