package array;

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
	}

}
