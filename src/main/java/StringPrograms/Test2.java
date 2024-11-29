package StringPrograms;

public class Test2 {

	public static void main(String[] args) {
       int fibse =4 ;
       
       int[] arr = new int[fibse];
       arr[0]=0;
       arr[1]=1;
       
       for (int i = 2; i < arr.length; i++) {
		arr[i]= arr[i-1]+arr[i-2];
		
	}
       for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[ i ] + "  ");
	}
	}
}
