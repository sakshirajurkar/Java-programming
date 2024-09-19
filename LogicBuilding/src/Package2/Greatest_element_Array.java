package Package2;
//greatest element in an array
public class Greatest_element_Array {

	public static void main(String[] args) {
		int a[] = {3,5,8,4,7,6,9};
		int great = 0;
		
		for(int i=0; i<a.length; i++) {
			if(great < a[i]) {
				great = a[i];
			}
		}
		System.out.println(great);
	}

}
