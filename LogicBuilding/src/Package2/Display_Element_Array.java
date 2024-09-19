package Package2;
//display the element of array
public class Display_Element_Array {

	public static void main(String[] args) {
		int a[] = {6,4,9,7,6,2};
		int num = 6;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==num) {
				num = a[i];
				System.out.println(i);
			}
		}
	}

}
