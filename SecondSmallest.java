package ArrayAssignment;
// find the second smallest no.
import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,1,4,7,4,8,9,0};
		Arrays.sort(a);  // sorted in asscending order by default
		// print second largest no.
		
		System.out.println("second smallest element is "+a[1]); 

	}

}
