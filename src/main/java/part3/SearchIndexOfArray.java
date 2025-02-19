package part3;

import java.util.Scanner;

public class SearchIndexOfArray 
{

	    public static void main(String[] args) {
	        int[] numbers = {10, 2,2,20, 30, 40, 50};
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter number to search: ");
	        int target = scanner.nextInt();
	        
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == target) {
	                System.out.println(i);
	                scanner.close();
	                return;
	            }
	        }
	        
	        System.out.println("Element not found in array.");
	        scanner.close();
	    }
	}

