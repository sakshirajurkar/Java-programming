package Package1;

public class DisplayPositionArray4 {

	public static void main(String[] args) {
		int a[] = {4,5,2,6,8};
		int b = 5;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==b) {
			System.out.println("position:" + ++i);
			}
		}
	}
}
