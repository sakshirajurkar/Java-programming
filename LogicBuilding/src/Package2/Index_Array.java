package Package2;

public class Index_Array {

	public static void main(String[] args) {
		int a[] = {3,5,2,4,7,9};
		int b = 4;
		for(int i=0; i<a.length; i++) {
			if(a[i]==b) {
				System.out.println(i);
			}
		}
	}

}
