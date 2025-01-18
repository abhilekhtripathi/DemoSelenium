package array;

<<<<<<< HEAD
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {12, 22, 3, 3, 34, 12, 28};
        int targetSum = 50;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                   // System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    System.out.println(arr[i] + " "+ arr[j]);
                    return; // Exit after finding the first pair
                }
            }
        }
        System.out.println("No pairs found.");
=======
public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {12, 16, 12, 34, 5, 38, 35};

        // Find 12 and 38 and sum them
        int sum = arr[1] + arr[3]; // arr[0] is 12 and arr[5] is 38
        System.out.println("Sum of : " + sum);

>>>>>>> 2c25406be795aebaf74642d3a6aed2f7112a1575
	}

}
