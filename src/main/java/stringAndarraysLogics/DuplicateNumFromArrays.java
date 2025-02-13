package stringAndarraysLogics;

public class DuplicateNumFromArrays{

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7, 8, 5, 4, 7, 9, 10, 10, 10 };
		boolean[] visited = new boolean[arr.length]; // To track counted elements

		//System.out.println("Duplicate elements with count:");

		for (int i = 0; i < arr.length; i++) {
			if (visited[i])
				continue; // Skip if already counted

			int count = 1; // Start count at 1
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true; // Mark duplicate as visited
				}
			}
			if (count > 1) {
				System.out.println(arr[i] + " appears " + count + " times");
			}
		}
	}
}
