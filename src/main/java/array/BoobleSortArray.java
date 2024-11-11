package array;

public class BoobleSortArray {

	public static void main(String[] args) {
   int [] a = {12,23,33,2,44,42};
     int temp ;
        for (int i = 0; i < a.length-i; i++) {
			for (int j = 0; j < a.length-1; j++) {
				
				if (a[j]> a[j+1]) {
					temp= a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
				}
				
			}
			
		}
        
        for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
        
	}

}
