package Package2;
//sum of array
public class Sum_of_Array_1 {

	public static void main(String[] args) {
		int a[] = {5,2,6,3,6,9};
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}
}
