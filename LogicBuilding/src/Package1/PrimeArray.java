package Package1;

public class PrimeArray {

	public static void main(String[] args) {
		int a[] = {6,5,8,3,2,4};
		
		
		for(int i=0; i<a.length; i++ ) {
			int count = 0;
			for(int j=2; j<a[i]; j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println(a[i]);
			}
		}
	}
}
