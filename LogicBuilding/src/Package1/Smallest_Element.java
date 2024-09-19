package Package1;

public class Smallest_Element {

	public static void main(String[] args) {
		int a[] = {3,4,7,5,9,10,2};
		int small = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]<small) {
				small = a[i];
			}
		}
		System.out.println(small);
	}

}
