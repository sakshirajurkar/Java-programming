package Package1;

public class FreqencySameNum {

	public static void main(String[] args) {
		int a[] = {2,3,6,5,4,7,4,4,8,4};
		int count = 0;
		int num = 4;
		for(int i=0; i<a.length; i++) {
			if(a[i] == num ) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
