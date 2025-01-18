package StringPrograms;

import java.util.Arrays;

public class StringSwap {

	public static void main(String[] args) {
		// Initialize the array
        String[] strarr = {"apple", "cheery", "mango", "mineway", "carrot", "lemon"};
       
        
        // Loop through the array, swapping each consecutive pair
        for (int i = 0; i < strarr.length - 1; i += 2) {
            // Swap elements at position i and i+1
            String temp = strarr[i];
            strarr[i] = strarr[i + 1];
            strarr[i + 1] = temp;
        }

        // Print the array after swapping
        for (String str : strarr) {
        	
            System.out.print(str + " ");

	}
	}
}
