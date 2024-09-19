package Package1;

public class GreatestNumArray3 {

	public static void main(String[] args) {
		int a[] = {3,4,3,6,4,7,8};
		int great = 0;
		
		for(int i=0; i<a.length; i++) {
		    if(great<a[i]) {
		    	great = a[i];
		    }
		}
		System.out.println(great);
	}
}
