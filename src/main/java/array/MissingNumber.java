package array;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4, 5,7};
        int n = arr.length + 1; // Since one number is missing, n is the array length + 1
        int totalSum = n * (n + 1) / 2; // Calculate the sum of first n natural numbers
        int arrSum = 0;
        
        // Loop through the array to calculate the sum of its elements
        for (int num : arr) {
            arrSum += num;
        }
        
        // The missing number is the difference between the total sum and the array sum
        int missingNumber = totalSum - arrSum;
        System.out.println("Missing number: " + missingNumber);
    }
}

