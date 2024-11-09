package com.abhi.personal;

public class MaxandMin {

	public static void main(String[] args) {

		int[] a = { 34, 56, 78, 9, 0, 32, 42, 34 };

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}

		}

		System.out.println("the max number of array is " + max);
		System.out.print("the max number of array is " + min);
	}
}
