package StringPrograms;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

         int fiblength = 15;
         
         int[] arr = new int[fiblength];
            arr[0]=0;
            arr[1]=1;
         
         for (int i = 2; i < arr.length; i++) {
			arr[i]= arr[i-1]+arr[i-2];
			
		}
         for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
