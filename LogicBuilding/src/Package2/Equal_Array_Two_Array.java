package Package2;

public class Equal_Array_Two_Array {

	public static void main(String[] args) {
		int a[] = {3,4,5,2,8,6};
		int b[] = {4,6,7,5,8,3};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
