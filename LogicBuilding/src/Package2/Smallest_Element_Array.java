package Package2;
//smallest element in an array
public class Smallest_Element_Array {

	public static void main(String[] args) {
		int a[] = {3,5,8,4,7,6,9};
		int small = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<small) {
				small= a[i];
			}
		}
		System.out.println(small);
	}
	

}
