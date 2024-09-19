package Package2;
//remove element from array
public class Delete_Element_Array {

	public static void main(String[] args) {
		int a[] = {4,3,6,6,8,7};
		int del = 6;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==del) {
				del =a[i];
			}
		}
		System.out.println(del);
	}

}
