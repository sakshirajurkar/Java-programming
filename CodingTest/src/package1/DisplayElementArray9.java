package package1;

public class DisplayElementArray9 {

	public static void main(String[] args) {
		int a[] = {65,98,56,86,756,76,367,57};
		int show = 756;
		
		for(int i=0; i<a.length; i++) {
			if(show==a[i]) {
				System.out.println("display index of array:"+ ++i);
			}
		}
	}
}
