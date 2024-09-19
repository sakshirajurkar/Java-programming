package Package1;

public class ArrayAvg {

	public static void main(String[] args) {
		int a[] = {2,4,7,5,9,6};
		int sum = 0;
		
		for (int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of array"+ sum);
		
		int avg = sum / 6; 
		System.out.println(avg);
	}

}
