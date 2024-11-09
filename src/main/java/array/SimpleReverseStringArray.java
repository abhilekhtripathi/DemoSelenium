package array;
import java.util.Arrays;

public class SimpleReverseStringArray {
    public static void main(String[] args) {
        String[] stringArray = {"apple", "banana", "cherry"};

        System.out.println("Original Array: " + Arrays.toString(stringArray));

        // Reverse the array
        for (int i = 0; i < stringArray.length / 2; i++) {
            String temp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];
            stringArray[stringArray.length - 1 - i] = temp;
        }

        System.out.println("Reversed Array: " + Arrays.toString(stringArray));
    }
}
