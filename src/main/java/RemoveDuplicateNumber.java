

import java.util.HashSet;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		int[] a = { 11, 2, 33, 3, 4, 6, 6, 7, 8, 9, 9 };
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++)
			hs.add(a[i]);
		{

			for (int no : hs) {
				System.out.print(no + " ");
			}

		}

	}

}
//sort the array  /> compare the current ele with next ele > if both are same >  change one ele to -1 now print all elements except the index which value -1