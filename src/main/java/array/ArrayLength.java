package array;
//		int i =-1;
//		i+=-1;
//		i+=1;
//		System.out.println(i);

public class ArrayLength {
	public static void main(String[] args) {
		int count = 0;
		int[] arr = {-1, -1, 1, 1, -1, 1, 1, -1, 1};
		System.out.println("Length of the array: " + arr.length);
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
			if (sum == 0) {
				count++;
			}
		}

		System.out.println("the count no is :" + count);
	}
}
