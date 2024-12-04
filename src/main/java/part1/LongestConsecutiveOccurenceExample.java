
package part1;

public class LongestConsecutiveOccurenceExample {

	public static void main(String[] args) {

		int[] arr = { 4, 3, 25, 5,6, 7, 8, 2, 3, 10 };// jo number serial se chl rhe hai usko bolte h 

		
		int count = 0; // Tracks the current length of a consecutive sequence.
		int max = 0;   // Stores the maximum length of any consecutive sequence found so far.

		for (int i = 0; i < arr.length - 1; i++) { // Loop through the array till the second-last element.

		    if (arr[i] + 1 == arr[i + 1]) { // Check if the current element and the next are consecutive.
		        count++; // If yes, increase the count of the current streak.
		    } else { 
		        count = 0; // If not consecutive, reset the count to 0 because the streak is broken.
		    }

		    max = Math.max(max, count + 1); // Update `max` with the larger value between the current max 
		                                    // and the current streak length (`count + 1` to include the first element of the streak).
		}

		System.out.println(max); // Print the length of the longest consecutive sequence.

	}

}
