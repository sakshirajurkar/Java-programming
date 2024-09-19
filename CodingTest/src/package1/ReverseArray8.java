package package1;

public class ReverseArray8 {

	public static void main(String[] args) {
		int a[] = {56,98,55,43,98};
				
		for(int i=0; i<a.length; i++) {
			int rev = a[0];
			
			for(int j=a.length-1; j<=a[i]; j--) {
				System.out.println(a[j]);
			}
		}
		
	}
}
