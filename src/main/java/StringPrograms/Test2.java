package StringPrograms;

import java.util.Iterator;

public class Test2 {

	public static void main(String[] args) {

		int[] a = { 12, 23, 34, 45, 122 };

		int max= a[0];
		int min = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
			
			if (a[i]<min) {
				min= a[i];
			}
		}
		
		System.out.println("the max number is :"+max);
		System.out.println("the max number is :"+min);

	}
}
