package Package2;

public class Average_Array {

	 public static void main(String[] args) {
		 int a[] = {4,3,6,6,8,7};
		 int sum =0;
		 for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		 }
		 System.out.println(sum);
		 //average
		 int avg = 0;
		 avg = sum /  6;
		 System.out.println(avg);
	}
}
