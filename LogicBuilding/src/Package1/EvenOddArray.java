package Package1;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[] = {7,5,9,3,4,8,6};
		int num = 2;
		for(int i=0; i<a.length; i++) {
			if(a[i]%num==0) {
				System.out.println("even num"+a[i]);
			}
			else {
				System.out.println("odd num"+a[i]);
			}
			
		}
	}

}
