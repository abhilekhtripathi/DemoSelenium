package part3;

public class CountEvenOdd 
{
	    public static void main(String[] args) {
	        int[] numbers = {10, 22, 13, 4, 155, 16, 7, 18, 9, 10}; // Example array
	        
	        int evenCount = 0, oddCount = 0;
	        
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }
	        
	        System.out.println("Number of even numbers: " + evenCount);
	        System.out.println("Number of odd numbers: " + oddCount);
	    }
	}//O(n) big O

	
