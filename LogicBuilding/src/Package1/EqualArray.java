package Package1;

public class EqualArray {

	public static void main(String[] args) {
		int a[] = {4,8,6,2,6};
		int b[] = {3,9,5,7,4};
		int equal = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j]) {
					equal = a[i];
					equal = b[j];
				}
			}
		}
		System.out.println(equal);
	}
}
