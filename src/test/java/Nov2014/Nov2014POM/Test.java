package Nov2014.Nov2014POM;
public class Test{
	public static void main(String[] args) {
		
            int [] arr = {12,23,11,2,145};
            
            int start = 0;
            int end = arr.length-1;
            
            while (start < end) {
				int temp = arr[start];
				arr[start]= arr[end];
				
				arr[end]= temp;
				
				start++;
				end--;
           }
            for (int num : arr) {
				System.out.print(num + " ");
			}
		
	}
}
