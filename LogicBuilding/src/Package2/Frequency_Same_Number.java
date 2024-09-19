package Package2;

public class Frequency_Same_Number {

	public static void main(String[] args) {
		int a[] = {3,5,8,5,6,8,8,10};
		int b =5;
		int count =0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==b) {
				count++;
			}
		}
		System.out.println(count);
	}

}
