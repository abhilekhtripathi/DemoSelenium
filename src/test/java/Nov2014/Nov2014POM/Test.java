package Nov2014.Nov2014POM;


public class Test{
	public static void main(String[] args) {
		
		int [] arr = {12,25,258,123};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for (int num : arr) {
			if (num> first) {
				second=first;
				first= num;
			}
			else if (num>second && num!=first) {
				second = num;
			}
		}
		System.out.println("the largest number of arrays is :"+second);
		
	}
}
