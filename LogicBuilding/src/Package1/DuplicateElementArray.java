package Package1;

public class DuplicateElementArray {

	public static void main(String[] args) {
		int a[] = {3,2,5,6,4,7,7};
		int dup = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==a[i]) {
				dup = a[i];
			}
		}
		System.out.println(dup);
	}

}
