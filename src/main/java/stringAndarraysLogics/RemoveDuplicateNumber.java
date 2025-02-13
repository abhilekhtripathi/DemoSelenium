package part2;

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

	}}
