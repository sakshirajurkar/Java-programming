package Package1;

public class GreatestNumArray {

	public static void main(String[] args) {
		int a[] = {6,8,4,9,56,8};
		int great = 0;
		for(int i=0; i<a.length ; i++) {
			if(great < a[i]) {
				great = a[i];
			}
		}
		System.out.println(great);
	}
}
