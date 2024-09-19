package Package1;

public class SumofArray {

		public static void main(String[] args) {
			int a[] = {77,24,67,423,984};
			int sum = a[0];
			
			for(int i=0; i<a.length; i++) {
				sum = sum + a[i];
			}
			System.out.println("sum of array:"+sum);
		}
}
