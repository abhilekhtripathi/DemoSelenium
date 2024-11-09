package array;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 3, 5,9,9};
        HashMap<Integer, Integer> freqMap = new HashMap<>(); // Initialize HashMap to store frequencies
        
        // Loop through the array
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1); // Update the frequency of each element
        }
        
        // Print the frequency map
        System.out.println("Element frequencies: " + freqMap);
    }
}

